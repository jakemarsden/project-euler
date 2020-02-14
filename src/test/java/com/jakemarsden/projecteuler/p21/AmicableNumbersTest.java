package com.jakemarsden.projecteuler.p21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AmicableNumbersTest {

  @Test
  void givenSolution() {
    var obj = new AmicableNumbers();
    assertEquals(284, obj.sumDivisorsOf(220, 284));
    assertEquals(220, obj.sumDivisorsOf(284, 220));
  }

  @Test
  void targetSolution() {
    var obj = new AmicableNumbers();
    assertEquals(31626, obj.sumAmicableNumbersUnder(10_000));
  }
}
