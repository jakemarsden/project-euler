package com.jakemarsden.projecteuler;

import static com.jakemarsden.projecteuler.BigMath.bigDigitSum;
import static com.jakemarsden.projecteuler.BigMath.bigFactorial;

final class P0020_FactorialDigitSum {

  int digitSumOfFactorial(int n) {
    var factorial = bigFactorial(n);
    return bigDigitSum(factorial);
  }
}
