package com.jakemarsden.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P0004_LargestPalindromeProductTest {

  @Test
  void givenSolution() {
    var obj = new P0004_LargestPalindromeProduct();
    assertEquals(90_09, obj.product(2));
  }

  @Test
  void targetSolution() {
    var obj = new P0004_LargestPalindromeProduct();
    assertEquals(906_609, obj.product(3));
  }
}
