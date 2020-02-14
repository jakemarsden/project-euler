package com.jakemarsden.projecteuler.p18;

import static java.lang.Math.max;
import static java.lang.String.format;

final class MaximumPathSumI {

  int findMaximalPathSum(int[][] values) {
    var tree = constructTree(values);
    return walk(tree);
  }

  private int walk(Tree node) {
    var sum = node.value;
    if (!node.isLeaf()) sum += max(walk(node.left), walk(node.right));
    return sum;
  }

  private Tree constructTree(int[][] values) {
    var root = new Tree(values[0][0]);
    populateTree(values, 1, 0, root);
    return root;
  }

  private void populateTree(int[][] values, int depth, int offset, Tree parent) {
    if (depth >= values.length) return;

    // I kind of just wrote this expecting it to fail, but it didn't and now I don't have the
    // slightest clue how/why it works... let's just hope I never have to come back here again
    populateTree(values, depth + 1, offset, parent.left = new Tree(values[depth][offset]));
    populateTree(values, depth + 1, offset + 1, parent.right = new Tree(values[depth][offset + 1]));
  }

  private static final class Tree {

    final int value;
    Tree left;
    Tree right;

    Tree(int value) {
      this.value = value;
    }

    boolean isLeaf() {
      return this.left == null && this.right == null;
    }

    @Override
    public String toString() {
      return this.isLeaf()
          ? format("%,d", this.value)
          : format("%,d => [%s, %s]", this.value, this.left, this.right);
    }
  }
}
