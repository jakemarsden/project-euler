package com.jakemarsden.projecteuler.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmallestMultipleTest {

  @Test
  void givenSolution() {
    var obj = new SmallestMultiple();
    assertEquals(2520, obj.smallestMultiple(10));
  }

  @Test
  void targetSolution() {
    var obj = new SmallestMultiple();
    assertEquals(232_792_560, obj.smallestMultiple(20));
  }
}
