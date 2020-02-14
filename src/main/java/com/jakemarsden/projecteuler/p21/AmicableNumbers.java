package com.jakemarsden.projecteuler.p21;

import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;

final class AmicableNumbers {

  int sumAmicableNumbersUnder(int limitExclusive) {
    var sum = 0;

    // `d(n) == 0` for `n=1` only, so start with `a=2, b=3`
    for (int a = 2; a < limitExclusive - 1; a++) {
      var sumDivisorsOfA = sumDivisorsOf(a, Integer.MAX_VALUE);

      for (int b = a + 1; b < limitExclusive; b++) {
        if (sumDivisorsOfA != b) continue;
        if (sumDivisorsOf(b, sumDivisorsOfA) != a) continue;
        sum += a;
        sum += b;
      }
    }
    return sum;
  }

  /** @return {@code -1 || [1, limit)} */
  int sumDivisorsOf(int n, int limit) {
    // start at 1: all `n` are divisible by 1 and `n`, but add only 1 as the divisor must be `< n`
    int sumOfDivisors = 1;

    var maxDivisor = (int) ceil(sqrt(n));
    for (int divisor = 2; divisor < maxDivisor; divisor++) {
      if (n % divisor == 0) {
        sumOfDivisors += divisor;
        sumOfDivisors += n / divisor;
        if (sumOfDivisors > limit) return -1;
      }
    }
    if (n % maxDivisor == 0) {
      // `n` is a perfect square, only add the divisor (`sqrt(n)`) once
      sumOfDivisors += maxDivisor;
    }
    return sumOfDivisors;
  }
}
