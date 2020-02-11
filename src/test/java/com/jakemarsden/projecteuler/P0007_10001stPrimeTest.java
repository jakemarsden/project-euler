package com.jakemarsden.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P0007_10001stPrimeTest {

  @Test
  void givenSolution() {
    var obj = new P0007_10001stPrime();
    assertEquals(13, obj.nthPrime(6));
  }

  @Test
  void targetSolution() {
    var obj = new P0007_10001stPrime();
    assertEquals(104_743, obj.nthPrime(10_001));
  }
}
