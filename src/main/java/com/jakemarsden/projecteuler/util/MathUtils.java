package com.jakemarsden.projecteuler.util;

import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;

import java.math.BigInteger;

public final class MathUtils {

  /** @return {@code 1+2+...+(n-1)+n} */
  public static int nthTriangleNumber(int n) {
    return n * (n + 1) / 2;
  }

  /**
   * @see Math#log(double)
   * @see Math#log10(double)
   */
  public static double log(int n, int base) {
    return Math.log(n) / Math.log(base);
  }

  /** @return {@code n!} */
  public static BigInteger factorial(int n) {
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
  public static BigInteger factorialQuotient(int dividend, int divisor) {
    assert dividend >= divisor;
    var product = BigInteger.ONE;
    for (int n = dividend; n > divisor; n--) product = product.multiply(BigInteger.valueOf(n));
    return product;
  }

  /**
   * If the caller already knows certain things about {@code n}, it may consider using {@code
   * #isPrimeAssumeOdd(int)} for performance
   *
   * @param n the value to check
   * @return {@code true} if {@code n} is prime
   * @see #isPrimeAssumeOdd(int)
   */
  public static boolean isPrime(int n) {
    if (n < 2) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;
    return isPrimeAssumeOdd(n);
  }

  /**
   * Assume that {@code n} is either <em>odd</em> or is <em>exactly {@code 2}</em>, for performance.
   * This means that some even values of {@code n} (but not {@code 2}) will be erroneously
   * considered prime.
   *
   * <p>The caller is <strong>strongly encouraged</strong> to use {@link #isPrime(int)} if
   * divisibility by {@code 2} is not implied by the surrounding code.
   *
   * @param n the <em>odd</em> value to check, {@code >= 2}
   * @return
   *     <ul>
   *       <li><em>garbage</em> if {@code n < 2}
   *       <li><em>garbage</em> if {@code n > 2} and {@code n} is even
   *       <li>{@code true} if {@code n} is prime
   *       <li>{@code false} otherwise
   *     </ul>
   *
   * @see #isPrime(int)
   */
  public static boolean isPrimeAssumeOdd(int n) {
    var maxDivisor = (int) ceil(sqrt(n));
    for (int divisor = 3; divisor <= maxDivisor; divisor += 2) {
      if (n % divisor == 0) return false;
    }
    return true;
  }

  /**
   * Finds the first prime number greater than {@code n}. {@code n} itself doesn't need to be prime,
   * although it should be {@code >= 2}. Can be used to iterate over a sequence of primes, e.g.:
   *
   * <p><code>
   * <pre>
   * for (int prime = 2; prime <= maxPrime; prime = nextPrime(prime)) {
   *   ...
   * }
   * </pre>
   * </code>
   *
   * @param n {@code >= 2}
   * @return the first prime number greater than {@code n}, or garbage if {@code n < 2}
   */
  public static int nextPrime(int n) {
    n += 1 + (n % 2);
    while (!isPrimeAssumeOdd(n)) n += 2;
    return n;
  }

  private MathUtils() {
    throw new UnsupportedOperationException();
  }
}
