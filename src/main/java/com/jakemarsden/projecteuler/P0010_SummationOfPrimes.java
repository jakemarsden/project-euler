package com.jakemarsden.projecteuler;

import static com.jakemarsden.projecteuler.MathUtils.nextPrime;

final class P0010_SummationOfPrimes {

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
