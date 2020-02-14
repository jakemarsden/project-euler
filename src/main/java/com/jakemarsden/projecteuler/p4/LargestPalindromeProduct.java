package com.jakemarsden.projecteuler.p4;

import static java.lang.Math.pow;

final class LargestPalindromeProduct {

  int product(int digits) {
    int minFactor = (int) pow(10, digits - 1);
    int maxFactor = (int) pow(10, digits) - 1;

    int largestPalindrome = 0;
    for (int factor1 = maxFactor; factor1 >= minFactor; factor1--) {
      for (int factor2 = maxFactor; factor2 >= minFactor; factor2--) {
        var product = factor1 * factor2;
        if (product > largestPalindrome && isPalindrome(product)) largestPalindrome = product;
      }
    }
    return largestPalindrome;
  }

  private boolean isPalindrome(long value) {
    var str = Long.toString(value);

    int idx1 = 0;
    int idx2 = str.length() - 1;
    while (idx1 < idx2) {
      if (str.charAt(idx1) != str.charAt(idx2)) return false;
      idx1++;
      idx2--;
    }
    return true;
  }
}
