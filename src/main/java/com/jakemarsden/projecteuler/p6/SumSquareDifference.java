package com.jakemarsden.projecteuler.p6;

import static com.jakemarsden.projecteuler.util.MathUtils.nthTriangleNumber;
import static java.lang.Math.abs;

final class SumSquareDifference {

  int sumSquareDifference(int n) {
    int sumOfSquares = 0;
    for (int i = 0; i <= n; i++) sumOfSquares += i * i;

    int sum = nthTriangleNumber(n);
    int squareOfSum = sum * sum;

    return abs(sumOfSquares - squareOfSum);
  }
}
