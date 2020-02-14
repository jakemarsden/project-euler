package com.jakemarsden.projecteuler.p25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class _1000DigitFibonacciNumberTest {

  @Test
  void givenSolution() {
    var obj = new _1000DigitFibonacciNumber();
    assertEquals(12, obj.idxOfFirstWithNDigits(3));
  }

  @Test
  void targetSolution() {
    var obj = new _1000DigitFibonacciNumber();
    assertEquals(4_782, obj.idxOfFirstWithNDigits(1_000));
  }
}
