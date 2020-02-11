package com.jakemarsden.projecteuler;

import java.math.BigInteger;

final class P0013_LargeSum {

  String firstNDigitsOfSum(int n, String... addends) {
    var sum = BigInteger.ZERO;
    for (var addend : addends) sum = sum.add(new BigInteger(addend));
    System.out.println(sum);
    return sum.toString().substring(0, n);
  }
}
