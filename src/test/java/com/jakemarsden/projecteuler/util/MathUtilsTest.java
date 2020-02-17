package com.jakemarsden.projecteuler.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

  private static final double EPSILON = 1e-8;

  @Test
  void log() {
    assertEquals(6.0, MathUtils.log(1_000_000, 10), EPSILON);
    assertEquals(8.0, MathUtils.log(256, 2), EPSILON);
  }

  @Test
  void factorial() {
    assertEquals(BigInteger.valueOf(120), MathUtils.factorial(5));
  }

  @Test
  void factorialQuotient() {
    assertEquals(BigInteger.valueOf(20), MathUtils.factorialQuotient(5, 3));
  }

  @Test
  void isPrime() {
    assertTrue(MathUtils.isPrime(2));
    assertTrue(MathUtils.isPrime(3));
    assertTrue(MathUtils.isPrime(5));
    assertTrue(MathUtils.isPrime(71));

    assertFalse(MathUtils.isPrime(1));
    assertFalse(MathUtils.isPrime(9));
    assertFalse(MathUtils.isPrime(15));

    assertFalse(MathUtils.isPrime(0));
    assertFalse(MathUtils.isPrime(4));
    assertFalse(MathUtils.isPrime(6));
  }

  @Test
  void isPrimeAssumeOdd() {
    assertTrue(MathUtils.isPrimeAssumeOdd(2));
    assertTrue(MathUtils.isPrimeAssumeOdd(3));
    assertTrue(MathUtils.isPrimeAssumeOdd(5));
    assertTrue(MathUtils.isPrimeAssumeOdd(71));

    assertFalse(MathUtils.isPrime(1));
    assertFalse(MathUtils.isPrimeAssumeOdd(9));
    assertFalse(MathUtils.isPrimeAssumeOdd(15));
  }

  @Test
  void nextPrime() {
    assertEquals(3, MathUtils.nextPrime(2));
    assertEquals(5, MathUtils.nextPrime(3));
    assertEquals(5, MathUtils.nextPrime(4));

    assertEquals(17, MathUtils.nextPrime(13));
    assertEquals(17, MathUtils.nextPrime(14));
    assertEquals(17, MathUtils.nextPrime(15));
    assertEquals(17, MathUtils.nextPrime(16));
    assertEquals(19, MathUtils.nextPrime(17));
  }
}
