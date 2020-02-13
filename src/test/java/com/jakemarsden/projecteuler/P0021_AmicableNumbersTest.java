package com.jakemarsden.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class P0021_AmicableNumbersTest {

  @Test
  void givenD() {
    var obj = new P0021_AmicableNumbers();
    assertEquals(284, obj.d(220));
    assertEquals(220, obj.d(284));
  }

  @Test
  void givenSolution() {
    var obj = new P0021_AmicableNumbers();
    assertTrue(obj.isAmicablePair(220, 284));
  }

  @Test
  void targetSolution() {
    var obj = new P0021_AmicableNumbers();
    assertEquals(31626, obj.sumOfAmicableNumbers(10_000));
  }
}
