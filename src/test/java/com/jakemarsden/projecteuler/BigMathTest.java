package com.jakemarsden.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BigMathTest {

  @Test
  void bigSum() {
    assertEquals("0", BigMath.bigSum("", ""));
    assertEquals("0", BigMath.bigSum("", "0"));
    assertEquals("0", BigMath.bigSum("0", "0"));

    assertEquals("1", BigMath.bigSum("1", "0"));
    assertEquals("3", BigMath.bigSum("1", "2"));
    assertEquals("10", BigMath.bigSum("9", "1"));

    assertEquals("4294967295", BigMath.bigSum("4294967295", "0"));
    assertEquals("4294967296", BigMath.bigSum("4294967295", "1"));
    assertEquals("8589934590", BigMath.bigSum("4294967295", "4294967295"));
    assertEquals("562949953421310", BigMath.bigSum("281474976710655", "281474976710655"));
  }

  @Test
  void bigProduct() {
    assertEquals("0", BigMath.bigProduct("", ""));
    assertEquals("0", BigMath.bigProduct("", "0"));
    assertEquals("0", BigMath.bigProduct("0", "0"));

    assertEquals("2", BigMath.bigProduct("1", "2"));
    assertEquals("6", BigMath.bigProduct("2", "3"));
    assertEquals("10", BigMath.bigProduct("5", "2"));
    assertEquals("100", BigMath.bigProduct("50", "2"));
    assertEquals("100", BigMath.bigProduct("10", "10"));
    assertEquals("1048576", BigMath.bigProduct("1024", "1024"));
    assertEquals("8589934590", BigMath.bigProduct("4294967295", "2"));
  }

  @Test
  void bigFactorial() {
    assertEquals("120", BigMath.bigFactorial(5));
  }

  @Test
  void bigDigitSum() {
    assertEquals(0, BigMath.bigDigitSum(""));
    assertEquals(0, BigMath.bigDigitSum("0"));
    assertEquals(1, BigMath.bigDigitSum("1"));
    assertEquals(5, BigMath.bigDigitSum("5"));
    assertEquals(7, BigMath.bigDigitSum("1024"));
  }
}
