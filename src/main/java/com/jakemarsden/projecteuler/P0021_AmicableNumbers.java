package com.jakemarsden.projecteuler;

import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;

/** TODO: Optimise solution (current runtime ~40s) */
final class P0021_AmicableNumbers {

  int sumOfAmicableNumbers(int limitExclusive) {
    var sum = 0;

    // `d(n) == 0` for `n=1` only, so start with `i=2, j=3`
    for (int i = 2; i < limitExclusive - 1; i++) {
      for (int j = i + 1; j < limitExclusive; j++) {
        if (isAmicablePair(i, j)) sum += i + j;
      }
    }
    return sum;
  }

  boolean isAmicablePair(int a, int b) {
    assert a != b;
    return d(a) == b && d(b) == a;
  }

  int d(int n) {
    // start at 1: all `n` are divisible by 1 and `n`, but we don't want to add `n` as the divisor
    //   must be `< n`
    int sumOfDivisors = 1;

    var maxDivisor = (int) ceil(sqrt(n));
    for (int divisor = 2; divisor < maxDivisor; divisor++) {
      if (n % divisor == 0) {
        sumOfDivisors += divisor;
        sumOfDivisors += n / divisor;
      }
    }
    if (n % maxDivisor == 0) {
      // it's a square number, only add `sqrt(n)` once
      sumOfDivisors += maxDivisor;
    }
    return sumOfDivisors;
  }
}
