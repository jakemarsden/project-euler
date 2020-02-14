package com.jakemarsden.projecteuler.p17;

final class NumberLetterCounts {

  private static final int[] TEENS = {
    0,
    "one".length(),
    "two".length(),
    "three".length(),
    "four".length(),
    "five".length(),
    "six".length(),
    "seven".length(),
    "eight".length(),
    "nine".length(),
    "ten".length(),
    "eleven".length(),
    "twelve".length(),
    "thirteen".length(),
    "fourteen".length(),
    "fifteen".length(),
    "sixteen".length(),
    "seventeen".length(),
    "eighteen".length(),
    "nineteen".length()
  };

  private static final int[] TENS = {
    0,
    0,
    "twenty".length(),
    "thirty".length(),
    "forty".length(),
    "fifty".length(),
    "sixty".length(),
    "seventy".length(),
    "eighty".length(),
    "ninety".length()
  };

  private static final int[] HUNDREDS = {
    0,
    TEENS[1] + "hundred".length(),
    TEENS[2] + "hundred".length(),
    TEENS[3] + "hundred".length(),
    TEENS[4] + "hundred".length(),
    TEENS[5] + "hundred".length(),
    TEENS[6] + "hundred".length(),
    TEENS[7] + "hundred".length(),
    TEENS[8] + "hundred".length(),
    TEENS[9] + "hundred".length()
  };

  private static final int[] THOUSANDS = {0, TEENS[1] + "thousand".length()};

  int countCharsOfNumbersInRange(int endInclusive) {
    assert endInclusive <= 1_000;

    int sum = 0;
    for (int i = 1; i <= endInclusive; i++) {
      var count = countCharsOf(i);
      sum += count;
    }
    return sum;
  }

  private int countCharsOf(int n) {
    if (n == 1_000) return THOUSANDS[1];
    int count = 0;

    int hundreds = n / 100;
    int tensAndOnes = (hundreds == 0) ? n : n % (100 * hundreds);

    count += HUNDREDS[hundreds];
    if (hundreds != 0 && tensAndOnes != 0) count += 3; // the word "and"

    if (tensAndOnes < TEENS.length) {
      count += TEENS[tensAndOnes];
    } else {
      int tens = tensAndOnes / 10;
      int ones = tensAndOnes % (10 * tens);
      count += TENS[tens];
      count += TEENS[ones];
    }
    return count;
  }
}
