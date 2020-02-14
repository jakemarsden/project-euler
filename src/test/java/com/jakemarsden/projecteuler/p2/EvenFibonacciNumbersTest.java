package com.jakemarsden.projecteuler.p2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EvenFibonacciNumbersTest {

  @Test
  void givenSolution() {
    var obj = new EvenFibonacciNumbers();
    assertEquals(44, obj.sum(89));
  }

  @Test
  void targetSolution() {
    var obj = new EvenFibonacciNumbers();
    assertEquals(4_613_732, obj.sum(4_000_000));
  }
}
