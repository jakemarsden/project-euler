package com.jakemarsden.projecteuler.p29;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DistinctPowersTest {

  @Test
  void givenSolution() {
    var obj = new DistinctPowers();
    assertEquals(15, obj.countDistinctTerms(5, 5));
  }

  @Test
  void targetSolution() {
    var obj = new DistinctPowers();
    assertEquals(9_183, obj.countDistinctTerms(100, 100));
  }
}
