package com.jakemarsden.projecteuler.p28;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NumberSpiralDiagonalsTest {

  @Test
  void givenSolution() {
    var obj = new NumberSpiralDiagonals();
    assertEquals(101, obj.sumClockwiseSpiralDiagonals(5));
  }

  @Test
  void targetSolution() {
    var obj = new NumberSpiralDiagonals();
    assertEquals(669_171_001, obj.sumClockwiseSpiralDiagonals(1_001));
  }
}
