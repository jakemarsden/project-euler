package com.jakemarsden.projecteuler.p36;

final class DoubleBasePalindromes {

  int sumDoubleBasePalindromesUnder(int limit) {
    int sum = 0;
    for (int n = 1; n < limit; n++) {
      if (isDoubleBasePalindrome(n)) sum += n;
    }
    return sum;
  }

  boolean isDoubleBasePalindrome(int n) {
    return isPalindrome(Integer.toUnsignedString(n, 10))
        && isPalindrome(Integer.toUnsignedString(n, 2));
  }

  boolean isPalindrome(String str) {
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
