package com.jakemarsden.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P0016_PowerDigitSumTest {

  @Test
  void givenSolution() {
    var obj = new P0016_PowerDigitSum();
    assertEquals(26, obj.calculate(15));
  }

  @Test
  void targetSolution() {
    var obj = new P0016_PowerDigitSum();
    assertEquals(1_366, obj.calculate(1_000));
  }
}
