package com.jakemarsden.projecteuler.p7;

import static com.jakemarsden.projecteuler.util.MathUtils.nextPrime;

final class _10001stPrime {

  int nthPrime(int n) {
    int prime = 2;
    for (int idx = 1; idx < n; idx++) prime = nextPrime(prime);
    return prime;
  }
}
