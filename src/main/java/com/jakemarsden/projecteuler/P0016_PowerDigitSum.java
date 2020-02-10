package com.jakemarsden.projecteuler;

import static java.math.BigInteger.ONE;

import java.math.BigInteger;

final class P0016_PowerDigitSum {

  private static final BigInteger TEN = BigInteger.TEN;

  int calculate(int exp) {
    var n = powOf2(exp);
    return sumDigitsOf(n);
  }

  private int sumDigitsOf(BigInteger n) {
    int sum = 0;
    while (n.signum() != 0) {
      var quotientAndRemainder = n.divideAndRemainder(TEN);
      sum += quotientAndRemainder[1].intValueExact();
      n = quotientAndRemainder[0];
    }
    return sum;
  }

  private BigInteger powOf2(int exp) {
    return ONE.shiftLeft(exp);
  }
}
