package com.jakemarsden.projecteuler.p6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SumSquareDifferenceTest {

  @Test
  void givenSolution() {
    var obj = new SumSquareDifference();
    assertEquals(2_640, obj.sumSquareDifference(10));
  }

  @Test
  void targetSolution() {
    var obj = new SumSquareDifference();
    assertEquals(25_164_150, obj.sumSquareDifference(100));
  }
}
