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
    assertTrue(obj.isAbundant(24));

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
  void isSumOfTwoAbundantNumbers() {
    var abundancies = new boolean[29];
    abundancies[12] = true;
    abundancies[18] = true;
    abundancies[20] = true;
    abundancies[24] = true;

    var obj = new NonAbundantSums();
    assertTrue(obj.isSumOfTwoAbundantNumbers(12 + 12, abundancies));
    assertTrue(obj.isSumOfTwoAbundantNumbers(12 + 18, abundancies));
    assertTrue(obj.isSumOfTwoAbundantNumbers(18 + 18, abundancies));

    for (int i = 1; i < 24; i++) {
      var n = i;
      assertFalse(obj.isSumOfTwoAbundantNumbers(n, abundancies), () -> Integer.toString(n));
    }
    assertFalse(obj.isSumOfTwoAbundantNumbers(25, abundancies));
    assertFalse(obj.isSumOfTwoAbundantNumbers(29, abundancies));
  }

  @Test
  void targetSolution() {
    var obj = new NonAbundantSums();
    assertEquals(4_179_871, obj.sum());
  }
}
