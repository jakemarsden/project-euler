package com.jakemarsden.projecteuler.p20;

import static com.jakemarsden.projecteuler.util.BigMath.bigDigitSum;
import static com.jakemarsden.projecteuler.util.BigMath.bigFactorial;

final class FactorialDigitSum {

  int digitSumOfFactorial(int n) {
    var factorial = bigFactorial(n);
    return bigDigitSum(factorial);
  }
}
