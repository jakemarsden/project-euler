package com.jakemarsden.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P0017_NumberLetterCountsTest {

  @Test
  void givenSolution() {
    var obj = new P0017_NumberLetterCounts();
    assertEquals(19, obj.countCharsOfNumbersInRange(5));
  }

  @Test
  void targetSolution() {
    var obj = new P0017_NumberLetterCounts();
    assertEquals(21_124, obj.countCharsOfNumbersInRange(1_000));
  }
}
