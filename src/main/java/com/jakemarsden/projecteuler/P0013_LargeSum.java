package com.jakemarsden.projecteuler;

import static com.jakemarsden.projecteuler.BigMath.bigSum;

final class P0013_LargeSum {

  String firstNDigitsOfSum(int n, String... addends) {
    var sum = "";
    for (var addend : addends) sum = bigSum(addend, sum);
    System.out.println(sum);
    return sum.substring(0, n);
  }
}
