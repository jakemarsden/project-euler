package com.jakemarsden.projecteuler;

import static com.jakemarsden.projecteuler.MathUtils.factorial;
import static com.jakemarsden.projecteuler.MathUtils.factorialQuotient;

final class P0015_LatticePaths {

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
