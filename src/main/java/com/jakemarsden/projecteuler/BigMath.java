package com.jakemarsden.projecteuler;

final class BigMath {

  static String bigSum(String augend, String addend) {
    if (augend.length() > addend.length()) {
      var tmp = augend;
      augend = addend;
      addend = tmp;
    }

    var sum = new StringBuilder(addend.length() + 1);
    int carry = 0;

    int idxA = augend.length();
    int idxB = addend.length();
    while (idxB > 0) {
      idxA--;
      idxB--;

      int digitA = idxA >= 0 ? augend.charAt(idxA) - '0' : 0;
      int digitB = addend.charAt(idxB) - '0';

      int digitOut = digitA + digitB + carry;
      sum.insert(0, digitOut % 10);
      carry = digitOut / 10;
    }
    if (carry != 0 || sum.length() == 0) sum.insert(0, carry);

    return sum.toString();
  }

  private BigMath() {
    throw new UnsupportedOperationException();
  }
}
