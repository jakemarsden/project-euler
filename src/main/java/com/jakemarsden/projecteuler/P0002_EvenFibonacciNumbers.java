package com.jakemarsden.projecteuler;

final class P0002_EvenFibonacciNumbers {

  int sum(int max) {
    int term1 = 0;
    int term2 = 1;
    int sum = 0;
    while (true) {
      int value = term1 + term2;
      if (value > max) break;
      if (value % 2 == 0) sum += value;
      term1 = term2;
      term2 = value;
    }
    return sum;
  }
}
