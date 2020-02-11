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

  static String bigProduct(String multiplicand, String multiplier) {
    if (multiplier.length() > multiplicand.length()) {
      var tmp = multiplier;
      multiplier = multiplicand;
      multiplicand = tmp;
    }

    var product = "";

    for (int idx = multiplier.length() - 1, place = 0; idx >= 0; idx--, place++) {
      int multiplierDigit = multiplier.charAt(idx) - '0';
      var productPart = multiplySingleDigit(multiplicand, multiplierDigit);

      for (int i = 0; i < place; i++) productPart += "0";
      product = bigSum(productPart, product);
    }

    if (product.length() == 0) product = "0";
    return product;
  }

  private static String multiplySingleDigit(String multiplicand, int multiplier) {
    var product = new StringBuilder(multiplicand.length() + 1);
    int carry = 0;

    for (int idx = multiplicand.length() - 1; idx >= 0; idx--) {
      int digitIn = multiplicand.charAt(idx) - '0';

      int digitOut = digitIn * multiplier + carry;
      product.insert(0, digitOut % 10);
      carry = digitOut / 10;
    }
    if (carry != 0 || product.length() == 0) product.insert(0, carry);

    return product.toString();
  }

  static String bigFactorial(int n) {
    var product = "1";
    for (int i = n; i > 1; i--) product = bigProduct(Integer.toString(i), product);
    return product;
  }

  static int bigDigitSum(String n) {
    int sum = 0;
    for (int idx = 0; idx < n.length(); idx++) {
      int digit = n.charAt(idx) - '0';
      sum += digit;
    }
    return sum;
  }

  private BigMath() {
    throw new UnsupportedOperationException();
  }
}
