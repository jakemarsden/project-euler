package com.jakemarsden.projecteuler.p14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LongestCollatzSequenceTest {

  @Test
  void targetSolution() {
    var obj = new LongestCollatzSequence();
    assertEquals(837_799, obj.seedWithLongestSequence(1_000_000));
  }
}
