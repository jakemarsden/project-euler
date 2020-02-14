package com.jakemarsden.projecteuler.p13;

import static com.jakemarsden.projecteuler.util.BigMath.bigSum;

final class LargeSum {

  String firstNDigitsOfSum(int n, String... addends) {
    var sum = "";
    for (var addend : addends) sum = bigSum(addend, sum);
    return sum.substring(0, n);
  }
}
