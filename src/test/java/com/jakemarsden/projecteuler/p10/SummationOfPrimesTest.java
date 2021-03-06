package com.jakemarsden.projecteuler.p10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SummationOfPrimesTest {

  @Test
  void givenSolution() {
    var obj = new SummationOfPrimes();
    assertEquals(17, obj.sumOfPrimesLessThan(10));
  }

  @Test
  void targetSolution() {
    var obj = new SummationOfPrimes();
    assertEquals(142_913_828_922L, obj.sumOfPrimesLessThan(2_000_000));
  }
}
