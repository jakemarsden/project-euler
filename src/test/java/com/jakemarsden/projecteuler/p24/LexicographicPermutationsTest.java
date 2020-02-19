package com.jakemarsden.projecteuler.p24;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LexicographicPermutationsTest {

  @Test
  void givenSolution() {
    var obj = new LexicographicPermutations();
    assertEquals(12, obj.nthLexicographicPermutationOfDigits(1, 3));
    assertEquals(21, obj.nthLexicographicPermutationOfDigits(2, 3));
    assertEquals(102, obj.nthLexicographicPermutationOfDigits(3, 3));
    assertEquals(120, obj.nthLexicographicPermutationOfDigits(4, 3));
    assertEquals(201, obj.nthLexicographicPermutationOfDigits(5, 3));
    assertEquals(210, obj.nthLexicographicPermutationOfDigits(6, 3));
  }

  @Test
  void targetSolution() {
    var obj = new LexicographicPermutations();
    assertEquals(2_783_915_460L, obj.nthLexicographicPermutationOfDigits(1_000_000, 10));
  }
}
