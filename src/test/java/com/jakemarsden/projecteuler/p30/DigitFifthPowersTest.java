package com.jakemarsden.projecteuler.p30;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DigitFifthPowersTest {

  @Test
  void givenSolution() {
    var obj = new DigitFifthPowers();
    assertEquals(19_316, obj.sumAllSumsOfDigitPowers(4));
  }

  @Test
  void targetSolution() {
    var obj = new DigitFifthPowers();
    assertEquals(443_839, obj.sumAllSumsOfDigitPowers(5));
  }
}
