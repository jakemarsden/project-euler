package com.jakemarsden.projecteuler.p11;

import static java.lang.Math.max;

final class LargestProductInAGrid {

  int findLargestProduct(int seqLen, int[][] grid) {
    int rows = grid.length;
    int cols = grid[0].length;

    int largest = 0;
    largest = largestProduct(0, cols - seqLen, 0, rows - 1, +1, +0, seqLen, grid, largest);
    largest = largestProduct(0, cols - 1, 0, rows - seqLen, +0, +1, seqLen, grid, largest);
    largest = largestProduct(0, cols - seqLen, 0, rows - seqLen, +1, +1, seqLen, grid, largest);
    largest = largestProduct(seqLen - 1, cols - 1, 0, rows - seqLen, -1, +1, seqLen, grid, largest);
    return largest;
  }

  private int largestProduct(
      int firstCol,
      int lastCol,
      int firstRow,
      int lastRow,
      int dirX,
      int dirY,
      int seqLen,
      int[][] grid,
      int currentLargest) {

    for (int row = firstRow; row <= lastRow; row++) {
      for (int col = firstCol; col <= lastCol; col++) {
        var product = product(col, row, dirX, dirY, seqLen, grid);
        currentLargest = max(product, currentLargest);
      }
    }
    return currentLargest;
  }

  private int product(int col, int row, int dirX, int dirY, int seqLen, int[][] grid) {
    int product = 1;
    for (int i = 0; i < seqLen; i++) product *= grid[row + i * dirY][col + i * dirX];
    return product;
  }
}
