package com.jakemarsden.projecteuler;

final class P0014_LongestCollatzSequence {

  int seedWithLongestSequence(int maxSeed) {
    int longestSeqSeed = 0;
    int longestSeqLength = 0;

    for (int seed = 1; seed <= maxSeed; seed++) {
      var length = sequenceLength(seed);
      if (length > longestSeqLength) {
        longestSeqLength = length;
        longestSeqSeed = seed;
      }
    }
    return longestSeqSeed;
  }

  private int sequenceLength(int seed) {
    int length = 1;
    long n = seed;
    while (n != 1) {
      if (n % 2 == 0) n = n / 2;
      else n = 3 * n + 1;
      length++;
    }
    return length;
  }
}
