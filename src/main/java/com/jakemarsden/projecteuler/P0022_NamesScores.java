package com.jakemarsden.projecteuler;

import static java.lang.Math.min;

import java.util.ArrayList;
import java.util.List;

final class P0022_NamesScores {

  private final ResourceLoader resLoader;

  P0022_NamesScores() {
    this(ClasspathResourceLoader.fromPackage(P0022_NamesScores.class));
  }

  P0022_NamesScores(ResourceLoader resLoader) {
    this.resLoader = resLoader;
  }

  int totalNameScore(String fileName) {
    var namesStr = this.resLoader.loadText(fileName);
    var names = parseNames(new StringParser(namesStr));

    sortInPlace(names);

    var totalScore = 0;
    for (int nameIdx = 0; nameIdx < names.length; nameIdx++)
      totalScore += (nameIdx + 1) * scoreFor(names[nameIdx]);
    return totalScore;
  }

  int scoreFor(String name) {
    var score = 0;
    for (int charIdx = 0; charIdx < name.length(); charIdx++) {
      var c = name.charAt(charIdx);
      score += c - '@';
    }
    return score;
  }

  /**
   * TODO: Write a less shite sorting algorithm
   *
   * <p>Swap adjacent out-of-order items and repeat until sorted
   */
  private void sortInPlace(String[] items) {
    boolean sorted;
    do {
      sorted = true;

      for (int idx = 1; idx < items.length; idx++) {
        var cmp = compare(items[idx - 1], items[idx]);
        if (cmp > 0) {
          swapInPlace(items, idx - 1, idx);
          sorted = false;
        }
      }
    } while (!sorted);
  }

  private <T> void swapInPlace(T[] items, int idxA, int idxB) {
    var tmp = items[idxA];
    items[idxA] = items[idxB];
    items[idxB] = tmp;
  }

  /**
   * Note: compares by direct char comparison, e.e. {@code 'A'} comes <em>after</em> {@code 'z'}
   *
   * <ul>
   *   <li>{@code compare("a", "b") -> -int}
   *   <li>{@code compare("a", "aa") -> -int}
   *   <li>{@code compare("b", "a") -> +int}
   *   <li>{@code compare("aa", "a") -> +int}
   *   <li>{@code compare("a", "a") -> 0}
   * </ul>
   */
  private int compare(String a, String b) {
    for (int charIdx = 0; charIdx < min(a.length(), b.length()); charIdx++) {
      var cmp = a.charAt(charIdx) - b.charAt(charIdx);
      if (cmp != 0) return cmp;
    }
    return a.length() - b.length();
  }

  private String[] parseNames(StringParser parser) {
    List<String> names = new ArrayList<>();

    StringBuilder currName = null;
    while (true) {
      var c = parser.consume();
      if (c == '\0') {
        // reached end of string
        assert currName == null;
        break;
      }

      if (c == '"') {
        if (currName == null) {
          // start of next name
          currName = new StringBuilder();
          continue;

        } else {
          // end of current name
          names.add(currName.toString());
          currName = null;
          continue;
        }
      }

      if (currName != null) {
        // inside of current name
        currName.append(c);
      }

      // otherwise character is outside of quotes (probably a comma, whitespace, etc.)
      // not part of a name, just discard it
    }

    return names.toArray(String[]::new);
  }
}
