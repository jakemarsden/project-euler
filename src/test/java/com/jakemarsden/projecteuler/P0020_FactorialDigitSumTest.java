package com.jakemarsden.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P0020_FactorialDigitSumTest {

  @Test
  void givenSolution() {
    var obj = new P0020_FactorialDigitSum();
    assertEquals(27, obj.digitSumOfFactorial(10));
  }

  @Test
  void targetSolution() {
    var obj = new P0020_FactorialDigitSum();
    assertEquals(648, obj.digitSumOfFactorial(100));
  }
}
