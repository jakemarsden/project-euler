package com.jakemarsden.projecteuler;

import static java.lang.Math.ceil;
import static java.lang.Math.max;
import static java.lang.Math.sqrt;

final class P0003_LargestPrimeFactor {

  long factor(long value) {
    if (value % 2 == 0) return factor(value / 2);

    var maxFactor = (long) ceil(sqrt(value));
    for (long factor = 3; factor < maxFactor; factor += 2) {
      if (value % factor != 0) continue;

      long factor2 = value / factor;
      return max(factor(factor), factor(factor2));
    }

    // no factors, it's prime!
    return value;
  }
}
