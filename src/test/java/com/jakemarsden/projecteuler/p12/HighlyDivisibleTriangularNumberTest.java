package com.jakemarsden.projecteuler.p12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HighlyDivisibleTriangularNumberTest {

  @Test
  void givenSolution() {
    var obj = new HighlyDivisibleTriangularNumber();
    assertEquals(28, obj.firstWithOverNDivisors(5));
  }

  @Test
  void targetSolution() {
    var obj = new HighlyDivisibleTriangularNumber();
    assertEquals(76_576_500, obj.firstWithOverNDivisors(500));
  }
}
