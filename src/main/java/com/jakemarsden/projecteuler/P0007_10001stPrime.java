package com.jakemarsden.projecteuler;

final class P0007_10001stPrime {

  int nthPrime(int n) {
    int primeIdx = 2;
    int prime = 3;
    while (true) {
      prime += 2;
      if (isPrime(prime)) {
        primeIdx++;
        if (primeIdx == n) return prime;
      }
    }
  }

  private boolean isPrime(int value) {
    int maxDivisor = (value / 2) - 1;
    for (int divisor = 3; divisor <= maxDivisor; divisor += 2) {
      if (value % divisor == 0) return false;
    }
    return true;
  }
}
