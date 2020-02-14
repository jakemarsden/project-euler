package com.jakemarsden.projecteuler.p1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MultiplesOf3And5Test {

  @Test
  void givenSolution() {
    var obj = new MultiplesOf3And5();
    assertEquals(23, obj.sum(10));
  }

  @Test
  void targetSolution() {
    var obj = new MultiplesOf3And5();
    assertEquals(233_168, obj.sum(1_000));
  }
}
