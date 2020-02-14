package com.jakemarsden.projecteuler.p4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LargestPalindromeProductTest {

  @Test
  void givenSolution() {
    var obj = new LargestPalindromeProduct();
    assertEquals(90_09, obj.product(2));
  }

  @Test
  void targetSolution() {
    var obj = new LargestPalindromeProduct();
    assertEquals(906_609, obj.product(3));
  }
}
