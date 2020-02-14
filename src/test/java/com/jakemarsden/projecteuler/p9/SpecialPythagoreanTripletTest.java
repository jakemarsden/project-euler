package com.jakemarsden.projecteuler.p9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SpecialPythagoreanTripletTest {

  @Test
  void targetSolution() {
    var obj = new SpecialPythagoreanTriplet();
    assertEquals(31_875_000, obj.findAbc(1_000));
  }
}
