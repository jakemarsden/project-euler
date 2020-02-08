package com.jakemarsden.projecteuler;

final class P0001_MultiplesOf3And5 {

  int sum(int max) {
    int sum = 0;
    for (int i = 0; i < max; i++) {
      if (i % 3 == 0 || i % 5 == 0) sum += i;
    }
    return sum;
  }
}
