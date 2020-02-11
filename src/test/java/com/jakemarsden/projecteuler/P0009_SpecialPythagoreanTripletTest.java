package com.jakemarsden.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P0009_SpecialPythagoreanTripletTest {

  @Test
  void targetSolution() {
    var obj = new P0009_SpecialPythagoreanTriplet();
    assertEquals(31_875_000, obj.findAbc(1_000));
  }
}
