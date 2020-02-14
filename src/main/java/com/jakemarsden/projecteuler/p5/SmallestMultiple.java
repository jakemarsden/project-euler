package com.jakemarsden.projecteuler.p5;

final class SmallestMultiple {

  long smallestMultiple(int maxDivisor) {
    outer:
    for (long value = maxDivisor; ; value += maxDivisor) {
      for (int divisor = maxDivisor - 1; divisor > 1; divisor--) {
        if (value % divisor != 0) continue outer;
      }
      return value;
    }
  }
}
