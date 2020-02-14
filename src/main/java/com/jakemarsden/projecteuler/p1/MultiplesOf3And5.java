package com.jakemarsden.projecteuler.p1;

final class MultiplesOf3And5 {

  int sum(int max) {
    int sum = 0;
    for (int i = 0; i < max; i++) {
      if (i % 3 == 0 || i % 5 == 0) sum += i;
    }
    return sum;
  }
}
