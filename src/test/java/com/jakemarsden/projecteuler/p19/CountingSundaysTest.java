package com.jakemarsden.projecteuler.p19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CountingSundaysTest {

  @Test
  void targetSolution() {
    var obj = new CountingSundays();
    assertEquals(171, obj.countSundaysOnFirstOfMonthBetween(1901, 2000));
  }
}
