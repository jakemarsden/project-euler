package com.jakemarsden.projecteuler.p10;

import static com.jakemarsden.projecteuler.util.MathUtils.nextPrime;

final class SummationOfPrimes {

  long sumOfPrimesLessThan(int n) {
    long sum = 0;
    int prime = 2;
    while (prime < n) {
      sum += prime;
      prime = nextPrime(prime);
    }
    return sum;
  }
}
