package com.jakemarsden.projecteuler.p28;

final class NumberSpiralDiagonals {

  int sumClockwiseSpiralDiagonals(int spiralSize) {
    // spirals must have an odd width/height as the centre is always [0, 0]
    assert spiralSize % 2 == 1;

    int downRight = 1;
    int downLeft = 1;
    int upLeft = 1;
    int upRight = 1;

    // value in the centre, at [0, 0], is 1
    int sum = 1;

    for (int distFromCentre = 1; distFromCentre <= spiralSize / 2; distFromCentre++) {
      // compute value at [+distFromCentre, +distFromCentre]
      downRight += 4 * (distFromCentre - 1) + 1; // x
      downRight += 4 * (distFromCentre - 1) + 1; // y

      // compute value at [-distFromCentre, +distFromCentre]
      downLeft += 4 * (distFromCentre - 1) + 3; // x
      downLeft += 4 * (distFromCentre - 1) + 1; // y

      // compute value at [-distFromCentre, -distFromCentre]
      upLeft += 4 * (distFromCentre - 1) + 3; // x
      upLeft += 4 * (distFromCentre - 1) + 3; // y

      // compute value at [+distFromCentre, -distFromCentre]
      upRight += 4 * (distFromCentre - 1) + 5; // x
      upRight += 4 * (distFromCentre - 1) + 3; // y

      sum += downRight;
      sum += downLeft;
      sum += upLeft;
      sum += upRight;
    }

    return sum;
  }
}
