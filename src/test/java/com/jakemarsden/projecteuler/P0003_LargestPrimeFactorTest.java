package com.jakemarsden.projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P0003_LargestPrimeFactorTest {

  @Test
  void givenSolution() {
    var obj = new P0003_LargestPrimeFactor();
    assertEquals(29, obj.factor(13_195));
  }

  @Test
  void targetSolution() {
    var obj = new P0003_LargestPrimeFactor();
    assertEquals(6_857, obj.factor(600_851_475_143L));
  }
}
