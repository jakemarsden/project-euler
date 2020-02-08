package com.jakemarsden.projecteuler;

import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;

final class P0010_SummationOfPrimes {

  long sumOfPrimesLessThan(int n) {
    long sum = 2;
    for (int i = 3; i < n; i += 2) {
      if (isPrime(i)) sum += i;
    }
    return sum;
  }

  private boolean isPrime(int value) {
    assert (value % 2 == 1);
    int maxDivisor = (int) ceil(sqrt(value));
    for (int divisor = 3; divisor <= maxDivisor; divisor += 2) {
      if (value % divisor == 0) return false;
    }
    return true;
  }
}
