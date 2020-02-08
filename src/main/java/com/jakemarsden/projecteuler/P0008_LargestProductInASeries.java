package com.jakemarsden.projecteuler;

final class P0008_LargestProductInASeries {

  long findLargestProduct(int sequenceLength, String seriesStr) {
    var series = new int[seriesStr.length()];
    for (int charIdx = 0; charIdx < seriesStr.length(); charIdx++) {
      var c = seriesStr.charAt(charIdx);
      series[charIdx] = c - '0';
    }

    long largestProduct = 0;
    int maxStartIdx = series.length - sequenceLength;
    for (int startIdx = 0; startIdx <= maxStartIdx; startIdx++) {
      long product = 1;
      for (int idx = startIdx; idx < startIdx + sequenceLength; idx++) product *= series[idx];
      if (product > largestProduct) largestProduct = product;
    }
    return largestProduct;
  }
}
