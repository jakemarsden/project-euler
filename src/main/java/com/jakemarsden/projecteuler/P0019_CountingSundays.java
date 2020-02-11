package com.jakemarsden.projecteuler;

import static java.lang.String.format;

final class P0019_CountingSundays {

  int countSundaysOnFirstOfMonthBetween(int startYr, int endYr) {
    var date = Date.get(startYr, Date.JAN, 0);

    int sundayCount = 0;
    while (date.year <= endYr) {
      if (date.date == 0 && date.dayOfWeek == Date.SUN) sundayCount++;
      date = date.next();
    }
    return sundayCount;
  }

  private static final class Date implements Comparable<Date> {

    public static final int JAN = 0;
    public static final int FEB = 1;
    public static final int MAR = 2;
    public static final int APR = 3;
    public static final int MAY = 4;
    public static final int JUN = 5;
    public static final int JUL = 6;
    public static final int AUG = 7;
    public static final int SEP = 8;
    public static final int OCT = 9;
    public static final int NOV = 10;
    public static final int DEC = 11;

    public static final int MON = 0;
    public static final int TUE = 1;
    public static final int WED = 2;
    public static final int THU = 3;
    public static final int FRI = 4;
    public static final int SAT = 5;
    public static final int SUN = 6;

    private static final String[] DAY_OF_WEEK_NAMES = {
      "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"
    };

    private static final int[] MONTH_LENGTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    static boolean isLeapYear(int year) {
      return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }

    static int lengthOfMonth(int year, int month) {
      var days = MONTH_LENGTHS[month];
      if (month == FEB && isLeapYear(year)) days++;
      return days;
    }

    static Date firstOfJan1900() {
      return new Date(1900, JAN, 0, MON);
    }

    static Date get(int year, int month, int date) {
      var adv = firstOfJan1900();
      if (adv.compareTo(year, month, date) < 0) throw new IllegalArgumentException();
      while (adv.year < year || adv.month < month || adv.date < date) adv = adv.next();
      return adv;
    }

    final int year;
    /** Between {@value Date#JAN} for {@link Date#JAN} and {@value Date#DEC} for {@link Date#DEC} */
    final int month;
    /** Between {@code 0} for the 1<sup>st</sup> and {@code 30} for the 31<sup>st</sup> */
    final int date;
    /** Between {@value Date#MON} for {@link Date#MON} and {@value Date#SUN} for {@link Date#SUN} */
    final int dayOfWeek;

    private Date(int year, int month, int date, int dayOfWeek) {
      assert month >= JAN && month <= DEC;
      assert date >= 0 && date < lengthOfMonth(year, month);
      assert dayOfWeek >= MON && dayOfWeek <= SUN;
      this.year = year;
      this.month = month;
      this.date = date;
      this.dayOfWeek = dayOfWeek;
    }

    Date next() {
      var year = this.year;
      var month = this.month;
      var date = (this.date + 1) % lengthOfMonth(this.year, this.month);
      if (date == 0) {
        month = (month + 1) % 12;
        if (month == 0) year++;
      }

      var dayOfWeek = (this.dayOfWeek + 1) % 7;
      return new Date(year, month, date, dayOfWeek);
    }

    @Override
    public int compareTo(Date o) {
      return this.compareTo(o.year, o.month, o.date);
    }

    private int compareTo(int year, int month, int date) {
      var result = year - this.year;
      if (result == 0) result = month - this.month;
      if (result == 0) result = date - this.date;
      return result;
    }

    @Override
    public String toString() {
      return format(
          "%04d-%02d-%02d (%s)",
          this.year, this.month + 1, this.date + 1, DAY_OF_WEEK_NAMES[this.dayOfWeek]);
    }
  }
}
