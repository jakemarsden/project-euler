package com.jakemarsden.projecteuler.p24;

import static java.lang.System.arraycopy;

import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

final class LexicographicPermutations {

  /**
   * TODO: Improve efficiency => We don't need to actually generate each permutation as it should be
   * possible to <em>do the maths</em> to "jump" straight to the <code>n<sup>th</sup></code>
   * permutation
   *
   * @param n One-based
   * @param digitCount Digits used will be in the half-open range {@code [0, digitCount)}
   * @return An integer representing the <code>n<sup>th</sup></code> lexicographic permutation of
   *     the digits in the range {@code [0, digitCount)}
   */
  long nthLexicographicPermutationOfDigits(int n, int digitCount) {
    assert n > 0;
    assert digitCount > 0;

    var digits = new int[digitCount];
    for (int digit = 0; digit < digitCount; digit++) digits[digit] = digit;

    return permutationsOf(digits)
        .skip(n - 1)
        .findFirst()
        .map(this::permutationAsInt)
        .orElseThrow(); //
  }

  /**
   * Returns a stream of all possible permutations of the given {@code items}, in order.
   *
   * <p>Example usage ({@code n=3}):
   *
   * <pre><code>
   * permutationsOf(0, 1, 2) == Stream.of(
   *   {0, 1, 2},
   *   {0, 2, 1},
   *   {1, 0, 2},
   *   {1, 2, 0},
   *   {2, 0, 1},
   *   {2, 1, 0}
   * )</code></pre>
   */
  private Stream<int[]> permutationsOf(int... items) {
    if (items.length == 1)
      // Base case: there is 1 permutation of 1 item
      return Stream.of(items);

    // General case: there are `n!` permutations of `n` items
    return IntStream.range(0, items.length)
        .mapToObj(
            prefixIdx -> {
              // Each item has a "go" at being the *prefix*...
              var prefixItem = items[prefixIdx];

              // ...leaving each of the remaining items as part of the *suffix*...
              var suffixItems = new int[items.length - 1];
              for (int itemIdx = 0, suffixIdx = 0; itemIdx < items.length; itemIdx++) {
                if (itemIdx != prefixIdx) suffixItems[suffixIdx++] = items[itemIdx];
              }

              // ...so all *suffix permutations* are found recursively...
              var suffixPermutations = this.permutationsOf(suffixItems);

              // ...leading to one permutation for each *prefix*/*suffix permutation* pair
              return suffixPermutations.map(
                  suffixPermutation -> {
                    var permutation = new int[items.length];
                    permutation[0] = prefixItem;
                    arraycopy(suffixPermutation, 0, permutation, 1, suffixPermutation.length);
                    return permutation;
                  });
            })
        .flatMap(Function.identity());
  }

  private long permutationAsInt(int[] permutation) {
    long value = 0;
    for (long digit : permutation) {
      value *= 10;
      value += digit;
    }
    return value;
  }
}
