package com.jakemarsden.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P0001_MultiplesOf3And5Test {

  @Test
  void givenSolution() {
    var obj = new P0001_MultiplesOf3And5();
    assertEquals(23, obj.sum(10));
  }

  @Test
  void targetSolution() {
    var obj = new P0001_MultiplesOf3And5();
    assertEquals(233_168, obj.sum(1_000));
  }
}
