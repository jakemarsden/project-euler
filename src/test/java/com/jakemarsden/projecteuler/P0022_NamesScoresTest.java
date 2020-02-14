package com.jakemarsden.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P0022_NamesScoresTest {

  @Test
  void givenSolution() {
    var obj = new P0022_NamesScores();
    assertEquals(53, obj.scoreFor("COLIN"));
  }

  @Test
  void targetSolution() {
    var obj = new P0022_NamesScores();
    assertEquals(871_198_282, obj.totalNameScore("p022_names.txt"));
  }
}
