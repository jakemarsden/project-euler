package com.jakemarsden.projecteuler.p27;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class QuadraticPrimesTest {

  @Test
  void givenSolution() {
    var obj = new QuadraticPrimes();
    assertEquals(40, obj.countConsecutivePrimes(1, 41));
    assertEquals(80, obj.countConsecutivePrimes(-79, 1_601));
  }

  @Test
  void targetSolution() {
    var obj = new QuadraticPrimes();
    assertEquals(-59_231, obj.findProductOfCoefficientsWithMaxConsecutivePrimes());
  }
}
