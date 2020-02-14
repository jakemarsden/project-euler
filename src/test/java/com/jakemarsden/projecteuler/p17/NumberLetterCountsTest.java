package com.jakemarsden.projecteuler.p17;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NumberLetterCountsTest {

  @Test
  void givenSolution() {
    var obj = new NumberLetterCounts();
    assertEquals(19, obj.countCharsOfNumbersInRange(5));
  }

  @Test
  void targetSolution() {
    var obj = new NumberLetterCounts();
    assertEquals(21_124, obj.countCharsOfNumbersInRange(1_000));
  }
}
