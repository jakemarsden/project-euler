package com.jakemarsden.projecteuler;

import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;

import java.math.BigInteger;

final class MathUtils {

  /** @return {@code n!} */
  static BigInteger factorial(int n) {
    return factorialQuotient(n, 1);
  }

  /**
   * <code>
   * <pre>
   * <sup>5!</sup>/<sub>3!</sub> = <sup>5*4*3*2*1</sup>/<sub>3*2*1</sub> = 5*4
   * </pre>
   * </code>
   *
   * @return {@code (dividend)! / (divisor)!}
   */
  static BigInteger factorialQuotient(int dividend, int divisor) {
    assert dividend >= divisor;
    var product = BigInteger.ONE;
    for (int n = dividend; n > divisor; n--) product = product.multiply(BigInteger.valueOf(n));
    return product;
  }

  /**
   * @param n the value to check
   * @return {@true} if {@code n} is a prime number
   * @see #isPrimeAssumeOdd(int)
   */
  static boolean isPrime(int n) {
    if (n == 2) return true;
    if (n % 2 == 0) return false;
    return isPrimeAssumeOdd(n);
  }

  /**
   * Assumes that {@code n} is either <em>odd</em>, or is <em>exactly {@code 2}</em> for
   * performance. This means that even values {@code &gt;2} will be erroneously considered primes.
   * The caller <strong>must check</strong> for divisibility by {@code 2} if this is not the desired
   * behaviour.
   *
   * @param n the value to check
   * @return {@code true} if {@code n} is a prime or an even number
   * @see #isPrime(int)
   */
  static boolean isPrimeAssumeOdd(int n) {
    var maxDivisor = (int) ceil(sqrt(n));
    for (int divisor = 3; divisor <= maxDivisor; divisor += 2) {
      if (n % divisor == 0) return false;
    }
    return true;
  }

  /**
   * Generates the next prime number in a sequence
   *
   * @param n the current position in a sequence of prime numbers
   * @return the first prime number which is greater than {@code n}
   */
  static int nextPrime(int n) {
    n += 1 + (n % 2);
    while (!isPrimeAssumeOdd(n)) n += 2;
    return n;
  }

  private MathUtils() {
    throw new UnsupportedOperationException();
  }
}
