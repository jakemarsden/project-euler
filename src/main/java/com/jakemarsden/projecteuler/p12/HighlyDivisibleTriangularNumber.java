package com.jakemarsden.projecteuler.p12;

import static java.lang.Math.sqrt;

final class HighlyDivisibleTriangularNumber {

  int firstWithOverNDivisors(int n) {
    int idx = 0;
    int tri = 0;
    while (true) {
      idx++;
      tri += idx;

      var c = divisorCountOf(tri);
      if (c > n) break;
    }
    return tri;
  }

  private int divisorCountOf(int n) {
    int count = 2; // 1 and n are always divisors of n

    int maxDivisor = (int) sqrt(n);
    for (int divisor = 2; divisor <= maxDivisor; divisor++) {
      if (n % divisor == 0) count += 2;
    }
    return count;
  }
}
