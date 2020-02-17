package com.jakemarsden.projecteuler.p36;

import static com.jakemarsden.projecteuler.util.MathUtils.log;
import static java.lang.Math.floor;

final class DoubleBasePalindromes {

  int sumDoubleBasePalindromesUnder(int limit) {
    int sum = 0;
    for (int n = 1; n < limit; n++) {
      if (isDoubleBasePalindrome(n)) sum += n;
    }
    return sum;
  }

  boolean isDoubleBasePalindrome(int n) {
    return isPalindrome(intToString(n, 10)) && isPalindrome(intToString(n, 2));
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

  String intToString(int n, int radix) {
    assert radix > 0 && radix <= 10;
    if (n == 0) return "0";

    var digitCount = (int) floor(log(n, radix)) + 1;
    var sb = new StringBuilder(digitCount);

    while (n != 0) {
      var digit = n % radix;
      n /= radix;
      sb.append((char) (digit + '0'));
    }
    return sb.toString();
  }
}
