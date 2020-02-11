package com.jakemarsden.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

  @Test
  void factorial() {
    assertEquals(BigInteger.valueOf(120), MathUtils.factorial(5));
  }

  @Test
  void factorialQuotient() {
    assertEquals(BigInteger.valueOf(20), MathUtils.factorialQuotient(5, 3));
  }
}
