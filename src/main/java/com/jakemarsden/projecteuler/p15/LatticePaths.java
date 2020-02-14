package com.jakemarsden.projecteuler.p15;

import static com.jakemarsden.projecteuler.util.MathUtils.factorial;
import static com.jakemarsden.projecteuler.util.MathUtils.factorialQuotient;

final class LatticePaths {

  /**
   * <code>
   * <pre>
   * <sup>(2n)!</sup>/<sub>n!</sub>2
   * </pre>
   * </code>
   */
  long calcRouteCount(int n) {
    var routeCount = factorialQuotient(2 * n, n).divide(factorial(n));
    return routeCount.longValueExact();
  }
}
