package com.jakemarsden.projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P0006_SumSquareDifferenceTest {

  @Test
  void givenSolution() {
    var obj = new P0006_SumSquareDifference();
    assertEquals(2_640, obj.sumSquareDifference(10));
  }

  @Test
  void targetSolution() {
    var obj = new P0006_SumSquareDifference();
    assertEquals(25_164_150, obj.sumSquareDifference(100));
  }
}
