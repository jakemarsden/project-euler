package com.jakemarsden.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P0015_LatticePathsTest {

  @Test
  void givenSolution() {
    var obj = new P0015_LatticePaths();
    assertEquals(6, obj.calcRouteCount(2));
  }

  @Test
  void targetSolution() {
    var obj = new P0015_LatticePaths();
    assertEquals(137_846_528_820L, obj.calcRouteCount(20));
  }
}
