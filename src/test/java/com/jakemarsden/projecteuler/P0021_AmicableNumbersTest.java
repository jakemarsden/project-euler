package com.jakemarsden.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P0021_AmicableNumbersTest {

  @Test
  void givenSolution() {
    var obj = new P0021_AmicableNumbers();
    assertEquals(284, obj.sumDivisorsOf(220, 284));
    assertEquals(220, obj.sumDivisorsOf(284, 220));
  }

  @Test
  void targetSolution() {
    var obj = new P0021_AmicableNumbers();
    assertEquals(31626, obj.sumAmicableNumbersUnder(10_000));
  }
}
