package com.jakemarsden.projecteuler.p16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PowerDigitSumTest {

  @Test
  void givenSolution() {
    var obj = new PowerDigitSum();
    assertEquals(26, obj.calculate(15));
  }

  @Test
  void targetSolution() {
    var obj = new PowerDigitSum();
    assertEquals(1_366, obj.calculate(1_000));
  }
}
