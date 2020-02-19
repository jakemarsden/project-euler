package com.jakemarsden.projecteuler.p24;

import static java.util.Collections.unmodifiableList;

import java.util.ArrayList;
import java.util.List;

final class LexicographicPermutations {

  /**
   * TODO: Improve efficiency => This method currently lists <strong>all possible
   * permutations</strong> of digits out-of-order, sorts them lexicographically, and returns the
   * <code>n<sup>th</sup></code> permutation. It would be <em>much</em> more efficient to generate
   * the permutations <strong>in-order</strong> and just stop as soon as the <code><sup>th</sup>
   * </code> permutation is reached.
   *
   * @param n One-based
   * @param digitCount Digits used will be in the half-open range {@code [0, digitCount)}
   * @return An integer representing the <code>n<sup>th</sup></code> lexicographic permutation of
   *     the digits in the range {@code [0, digitCount)}
   */
  long nthLexicographicPermutationOfDigits(int n, int digitCount) {
    assert n > 0;
    assert digitCount > 0;

    List<Integer> digits = new ArrayList<>(digitCount);
    for (int digit = 0; digit < digitCount; digit++) digits.add(digit);

    var permutations = permutationsOf(digits);
    return permutations.stream()
        .mapToLong(this::permutationAsInt)
        .sorted()
        .skip(n - 1)
        .findFirst()
        .orElseThrow();
  }

  private <T> List<List<T>> permutationsOf(List<T> items) {
    if (items.size() == 1)
      // Base case: there is 1 permutation of 1 item
      return List.of(items);

    if (items.size() == 2)
      // Base case: there are 2 permutations of 2 items
      return List.of(
          List.of(items.get(0), items.get(1)), //
          List.of(items.get(1), items.get(0)));

    // General case: there are `n!` permutations of `n` items
    List<List<T>> permutations = new ArrayList<>();
    for (int prefixItemIdx = 0; prefixItemIdx < items.size(); prefixItemIdx++) {
      // Each item has a "go" at being the *prefix*...
      var prefix = items.get(prefixItemIdx);

      // ...leaving each of the remaining items as part of the *suffix*...
      List<T> suffixItems = new ArrayList<>(items.size() - 1);
      for (int suffixIdx = 0; suffixIdx < items.size() - 1; suffixIdx++) {
        var suffixItemIdx = (prefixItemIdx + 1 + suffixIdx) % items.size();
        suffixItems.add(items.get(suffixItemIdx));
      }

      // ...so all *suffix permutations* are found recursively...
      var suffixPermutations = permutationsOf(suffixItems);

      // ...which leads to one permutation of items for each *prefix*/*suffix permutation* pair
      for (var suffixPermutation : suffixPermutations) {
        List<T> permutation = new ArrayList<>(items.size());
        permutation.add(prefix);
        permutation.addAll(suffixPermutation);
        permutations.add(permutation);
      }
    }

    return unmodifiableList(permutations);
  }

  private long permutationAsInt(List<Integer> permutation) {
    long value = 0;
    for (long digit : permutation) {
      value *= 10;
      value += digit;
    }
    return value;
  }
}
