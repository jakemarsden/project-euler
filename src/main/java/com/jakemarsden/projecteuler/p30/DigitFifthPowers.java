package com.jakemarsden.projecteuler.p30;

import static java.lang.Math.pow;

final class DigitFifthPowers {

  /**
   * @return Sum of all the numbers that can be written as the sum of {@code exponent} powers of
   *     their digits
   */
  int sumAllSumsOfDigitPowers(int exponent) {
    // FIXME: Brute force shows n<1e6 for exp=5, but need to prove upper limit for the general case
    //     to solve the problem satisfactorily
    int start = 11; // must have >=2 non-zero digits to be a sum
    int limit = (int) pow(10, exponent + 1);

    int sum = 0;
    for (int n = start; n < limit; n++) {
      if (n == calcSumOfDigitPowers(n, exponent)) sum += n;
    }
    return sum;
  }

  /** @return Sum of the decimal digits of {@code digits}, each to the power of {@code exp} */
  private int calcSumOfDigitPowers(int digits, int exp) {
    int sum = 0;
    while (digits != 0) {
      var digit = digits % 10;
      digits /= 10;
      sum += (int) pow(digit, exp);
    }
    return sum;
  }
}
