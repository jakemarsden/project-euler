package com.jakemarsden.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P0012_HighlyDivisibleTriangularNumberTest {

  @Test
  void givenSolution() {
    var obj = new P0012_HighlyDivisibleTriangularNumber();
    assertEquals(28, obj.firstWithOverNDivisors(5));
  }

  @Test
  void targetSolution() {
    var obj = new P0012_HighlyDivisibleTriangularNumber();
    assertEquals(76_576_500, obj.firstWithOverNDivisors(500));
  }
}
