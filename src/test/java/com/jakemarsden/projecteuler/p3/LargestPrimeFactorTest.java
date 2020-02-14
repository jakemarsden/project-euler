package com.jakemarsden.projecteuler.p3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LargestPrimeFactorTest {

  @Test
  void givenSolution() {
    var obj = new LargestPrimeFactor();
    assertEquals(29, obj.factor(13_195));
  }

  @Test
  void targetSolution() {
    var obj = new LargestPrimeFactor();
    assertEquals(6_857, obj.factor(600_851_475_143L));
  }
}
