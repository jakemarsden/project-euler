package com.jakemarsden.projecteuler.p23;

import static com.jakemarsden.projecteuler.util.MathUtils.nthTriangleNumber;
import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;

final class NonAbundantSums {

  /** Smallest positive integer which is abundant */
  private static final int MIN_ABUNDANT_NUMBER = 12;
  /** Smallest positive integer which can be written as the sum of two abundant numbers */
  private static final int MIN_ABUNDANT_SUM = 2 * MIN_ABUNDANT_NUMBER;
  /**
   * It can be shown that all integers greater than {@code 28,123} can be written as the sum of two
   * abundant numbers
   */
  private static final int MIN_WITH_GUARANTEED_ABUNDANT_SUM = 28_123 + 1;

  /**
   * @return Sum of all positive integers which <em>cannot</em> be written as the sum of two
   *     abundant numbers
   */
  int sum() {
    int sum = nthTriangleNumber(MIN_ABUNDANT_SUM - 1);
    for (int n = MIN_ABUNDANT_SUM + 1; n < MIN_WITH_GUARANTEED_ABUNDANT_SUM; n++) {
      if (!isSumOfTwoAbundants(n)) sum += n;
    }
    return sum;
  }

  /**
   * @return {@code true} if {@code n} can be written as {@code a+b}, where {@code a} and {@code b}
   *     are both {@link #isAbundant(int) abundant} integers
   */
  boolean isSumOfTwoAbundants(int n) {
    for (int a = MIN_ABUNDANT_NUMBER; a <= n / 2; a++) {
      if (isAbundant(a) && isAbundant(n - a)) return true;
    }
    return false;
  }

  /** @return {@code true} if the sum of the proper divisors of {@code n} exceeds {@code n} */
  boolean isAbundant(int n) {
    assert n >= 2;

    var sumOfDivisors = 1; // `1` is a proper divisor for all `n` but `n` itself isn't
    var sqrtN = (int) ceil(sqrt(n));

    for (int divisor = 2; divisor < sqrtN; divisor++) {
      if (n % divisor == 0) {
        sumOfDivisors += divisor;
        sumOfDivisors += n / divisor;
        if (sumOfDivisors > n) return true;
      }
    }

    // handle separately to avoid adding `sqrt(n)` twice for perfect squares
    if (sqrtN * sqrtN == n) {
      sumOfDivisors += sqrtN;
      if (sumOfDivisors > n) return true;
    }

    return false;
  }
}
