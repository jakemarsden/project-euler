package com.jakemarsden.projecteuler.p22;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NamesScoresTest {

  @Test
  void givenSolution() {
    var obj = new NamesScores();
    assertEquals(53, obj.scoreFor("COLIN"));
  }

  @Test
  void targetSolution() {
    var obj = new NamesScores();
    assertEquals(871_198_282, obj.totalNameScore("p022_names.txt"));
  }
}
