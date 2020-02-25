package com.jakemarsden.projecteuler.p24;

import static com.jakemarsden.projecteuler.util.MathUtils.factorial;
import static java.util.stream.Collectors.toList;

import java.util.stream.IntStream;

final class LexicographicPermutations {

  /**
   * @param n One-based
   * @param digitCount Digits used will be in the half-open range {@code [0, digitCount)}
   * @return An integer representing the <code>n<sup>th</sup></code> lexicographic permutation of
   *     the digits in the range {@code [0, digitCount)}
   */
  long nthLexicographicPermutationOfDigits(int n, int digitCount) {
    assert n > 0;
    assert digitCount > 0;

    // make `n` zero-based
    n--;

    // ordered list of digits not yet used by the permutation
    var remainingDigits = IntStream.range(0, digitCount).boxed().collect(toList());
    var permutation = new int[digitCount];

    for (int digitIdx = 0; digitIdx < digitCount; digitIdx++) {
      var digit = (int) (n / factorial(digitCount - digitIdx - 1));
      digit %= remainingDigits.size();

      // move target digit from the list of remaining digits onto the end of the permutation
      permutation[digitIdx] = remainingDigits.remove(digit);
    }

    return permutationAsInt(permutation);
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
