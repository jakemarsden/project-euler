package com.jakemarsden.projecteuler;

import static com.jakemarsden.projecteuler.BigMath.bigSum;

final class P0025_1000DigitFibonacciNumber {

  int idxOfFirstWithNDigits(int n) {
    var a = "0";
    var b = "1";
    int idx = 1;

    for (; b.length() < n; idx++) {
      var next = nextFibonacci(a, b);
      a = b;
      b = next;
    }
    return idx;
  }

  private String nextFibonacci(String a, String b) {
    return bigSum(a, b);
  }
}
