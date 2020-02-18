package com.jakemarsden.projecteuler.p37;

import static com.jakemarsden.projecteuler.util.MathUtils.isPrime;
import static com.jakemarsden.projecteuler.util.MathUtils.nextPrime;

final class TruncatablePrimes {

  /**
   * The number of primes which are truncatable from both from left-to-right and right-to-left.
   * Single digit primes are not considered truncatable.
   */
  private static final int TRUNCATABLE_PRIME_COUNT = 11;

  int sumOfAllTruncatablePrimes() {
    int sum = 0;
    int prime = 7;
    for (int i = 0; i < TRUNCATABLE_PRIME_COUNT; i++) {
      do prime = nextPrime(prime);
      while (!isPrimeTruncatable(prime));
      sum += prime;
    }
    return sum;
  }

  boolean isPrimeTruncatable(int n) {
    return isPrimeTruncatableLeft(n) && isPrimeTruncatableRight(n);
  }

  /** Right-to-left */
  private boolean isPrimeTruncatableLeft(int n) {
    n /= 10;
    if (n == 0) return true;
    if (!isPrime(n)) return false;
    return isPrimeTruncatableLeft(n);
  }

  /** Left-to-right */
  private boolean isPrimeTruncatableRight(int n) {
    int digits = 10;
    while (digits < n) digits *= 10;
    return isPrimeTruncatableRight(n, digits);
  }

  private boolean isPrimeTruncatableRight(int n, int digits) {
    n %= digits;
    digits /= 10;
    if (digits == 0) return true;
    if (!isPrime(n)) return false;
    return isPrimeTruncatableRight(n, digits);
  }
}
