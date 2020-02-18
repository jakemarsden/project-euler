package com.jakemarsden.projecteuler.p37;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TruncatablePrimesTest {

  @Test
  void isPrimeTruncatable() {
    var obj = new TruncatablePrimes();
    assertTrue(obj.isPrimeTruncatable(3_797));
  }

  @Test
  void targetSolution() {
    var obj = new TruncatablePrimes();
    assertEquals(748_317, obj.sumOfAllTruncatablePrimes());
  }
}
