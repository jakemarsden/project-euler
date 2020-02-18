package com.jakemarsden.projecteuler.p23;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class NonAbundantSumsTest {

  @Test
  void isAbundant() {
    var obj = new NonAbundantSums();
    assertTrue(obj.isAbundant(12));
    assertTrue(obj.isAbundant(18));
    assertTrue(obj.isAbundant(20));

    for (int i = 2; i < 12; i++) {
      var n = i;
      assertFalse(obj.isAbundant(n), () -> Integer.toString(n));
    }
    assertFalse(obj.isAbundant(13));
    assertFalse(obj.isAbundant(14));
    assertFalse(obj.isAbundant(15));
    assertFalse(obj.isAbundant(16));
  }

  @Test
  void isSumOfTwoAbundants() {
    var obj = new NonAbundantSums();
    assertTrue(obj.isSumOfTwoAbundants(12 + 12));
    assertTrue(obj.isSumOfTwoAbundants(12 + 18));
    assertTrue(obj.isSumOfTwoAbundants(18 + 18));

    for (int i = 1; i < 24; i++) {
      var n = i;
      assertFalse(obj.isSumOfTwoAbundants(n), () -> Integer.toString(n));
    }
    assertFalse(obj.isSumOfTwoAbundants(25));
    assertFalse(obj.isSumOfTwoAbundants(29));
  }

  @Test
  void targetSolution() {
    var obj = new NonAbundantSums();
    assertEquals(4_179_871, obj.sum());
  }
}
