package com.jakemarsden.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P0014_LongestCollatzSequenceTest {

  @Test
  void targetSolution() {
    var obj = new P0014_LongestCollatzSequence();
    assertEquals(837_799, obj.seedWithLongestSequence(1_000_000));
  }
}
