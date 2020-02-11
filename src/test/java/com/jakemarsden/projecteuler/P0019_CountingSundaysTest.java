package com.jakemarsden.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P0019_CountingSundaysTest {

  @Test
  void targetSolution() {
    var obj = new P0019_CountingSundays();
    assertEquals(171, obj.countSundaysOnFirstOfMonthBetween(1901, 2000));
  }
}
