package com.jakemarsden.projecteuler;

import static java.lang.Math.hypot;

final class P0009_SpecialPythagoreanTriplet {

  int findAbc(int target) {
    int a = 0;
    while (true) {
      a++;
      int b = a;
      while (true) {
        b++;
        var c = c(a, b);
        if ((a + b + c) > target) break;
        if ((a + b + c) == target) return a * b * (int) c;
      }
    }
  }

  private double c(int a, int b) {
    return hypot(a, b);
  }
}
