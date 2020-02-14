package com.jakemarsden.projecteuler.p20;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FactorialDigitSumTest {

  @Test
  void givenSolution() {
    var obj = new FactorialDigitSum();
    assertEquals(27, obj.digitSumOfFactorial(10));
  }

  @Test
  void targetSolution() {
    var obj = new FactorialDigitSum();
    assertEquals(648, obj.digitSumOfFactorial(100));
  }
}
