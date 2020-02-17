package com.jakemarsden.projecteuler.p36;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DoubleBasePalindromesTest {

  @Test
  void intToString() {
    var obj = new DoubleBasePalindromes();
    assertEquals("585", obj.intToString(585, 10));
    assertEquals("1001001001", obj.intToString(585, 2));

    assertEquals("0", obj.intToString(0, 10));
    assertEquals("0", obj.intToString(0, 2));
  }

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
