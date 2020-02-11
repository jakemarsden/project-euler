package com.jakemarsden.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P0002_EvenFibonacciNumbersTest {

  @Test
  void givenSolution() {
    var obj = new P0002_EvenFibonacciNumbers();
    assertEquals(44, obj.sum(89));
  }

  @Test
  void targetSolution() {
    var obj = new P0002_EvenFibonacciNumbers();
    assertEquals(4_613_732, obj.sum(4_000_000));
  }
}
