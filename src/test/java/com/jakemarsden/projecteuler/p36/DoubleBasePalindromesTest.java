package com.jakemarsden.projecteuler.p36;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DoubleBasePalindromesTest {

  @Test
  void isPalindrome() {
    var obj = new DoubleBasePalindromes();
    assertTrue(obj.isPalindrome("585"));
    assertTrue(obj.isPalindrome("1001001001"));
  }

  @Test
  void isDoubleBasePalindrome() {
    var obj = new DoubleBasePalindromes();
    assertTrue(obj.isDoubleBasePalindrome(585));
  }

  @Test
  void targetSolution() {
    var obj = new DoubleBasePalindromes();
    assertEquals(872_187, obj.sumDoubleBasePalindromesUnder(1_000_000));
  }
}
