package com.jakemarsden.projecteuler.p7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class _10001StPrimeTest {

  @Test
  void givenSolution() {
    var obj = new _10001stPrime();
    assertEquals(13, obj.nthPrime(6));
  }

  @Test
  void targetSolution() {
    var obj = new _10001stPrime();
    assertEquals(104_743, obj.nthPrime(10_001));
  }
}
