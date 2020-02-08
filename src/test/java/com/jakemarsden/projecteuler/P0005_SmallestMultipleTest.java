package com.jakemarsden.projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P0005_SmallestMultipleTest {

  @Test
  void givenSolution() {
    var obj = new P0005_SmallestMultiple();
    assertEquals(2520, obj.smallestMultiple(10));
  }

  @Test
  void targetSolution() {
    var obj = new P0005_SmallestMultiple();
    assertEquals(232_792_560, obj.smallestMultiple(20));
  }
}
