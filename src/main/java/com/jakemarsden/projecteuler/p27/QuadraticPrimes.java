package com.jakemarsden.projecteuler.p27;

import static com.jakemarsden.projecteuler.util.MathUtils.isPrime;

final class QuadraticPrimes {

  int findProductOfCoefficientsWithMaxConsecutivePrimes() {
    int coefficientWithMaxPrimesA = 0;
    int coefficientWithMaxPrimesB = 0;
    int maxPrimes = 0;

    int maxAbsA = 999;
    int maxAbsB = 1_000;
    for (int a = -maxAbsA; a <= maxAbsA; a++) {
      for (int b = -maxAbsB; b <= maxAbsB; b++) {
        var primes = countConsecutivePrimes(a, b);
        if (primes > maxPrimes) {
          coefficientWithMaxPrimesA = a;
          coefficientWithMaxPrimesB = b;
          maxPrimes = primes;
        }
      }
    }

    return coefficientWithMaxPrimesA * coefficientWithMaxPrimesB;
  }

  int countConsecutivePrimes(int a, int b) {
    int count = 0;
    for (int n = 0; ; n++) {
      var q = (n * n) + (n * a) + b;
      if (isPrime(q)) count++;
      else break;
    }
    return count;
  }
}
