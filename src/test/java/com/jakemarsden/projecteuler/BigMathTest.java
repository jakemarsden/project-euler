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
}
