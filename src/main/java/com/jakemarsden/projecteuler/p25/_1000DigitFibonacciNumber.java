package com.jakemarsden.projecteuler.p25;

import static com.jakemarsden.projecteuler.util.BigMath.bigSum;

final class _1000DigitFibonacciNumber {

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
