package com.jakemarsden.projecteuler;

import static java.lang.Math.abs;

final class P0006_SumSquareDifference {

  int sumSquareDifference(int n) {
    int sumOfSquares = 0;
    for (int i = 0; i <= n; i++) sumOfSquares += i * i;

    int sum = (n + 1) * (n / 2);
    int squareOfSum = sum * sum;

    return abs(sumOfSquares - squareOfSum);
  }
}
