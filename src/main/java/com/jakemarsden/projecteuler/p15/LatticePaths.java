package com.jakemarsden.projecteuler.p15;

import static com.jakemarsden.projecteuler.util.MathUtils.bigFactorial;
import static com.jakemarsden.projecteuler.util.MathUtils.bigFactorialQuotient;

final class LatticePaths {

  /**
   * <code>
   * <pre>
   * <sup>(2n)!</sup>/<sub>n!</sub>2
   * </pre>
   * </code>
   */
  long calcRouteCount(int n) {
    var routeCount = bigFactorialQuotient(2 * n, n).divide(bigFactorial(n));
    return routeCount.longValueExact();
  }
}
