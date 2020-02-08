package com.jakemarsden.projecteuler;

import static com.jakemarsden.projecteuler.MathUtils.nextPrime;

final class P0007_10001stPrime {

  int nthPrime(int n) {
    int prime = 2;
    for (int idx = 1; idx < n; idx++) prime = nextPrime(prime);
    return prime;
  }
}
