package com.jakemarsden.projecteuler.p15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LatticePathsTest {

  @Test
  void givenSolution() {
    var obj = new LatticePaths();
    assertEquals(6, obj.calcRouteCount(2));
  }

  @Test
  void targetSolution() {
    var obj = new LatticePaths();
    assertEquals(137_846_528_820L, obj.calcRouteCount(20));
  }
}
