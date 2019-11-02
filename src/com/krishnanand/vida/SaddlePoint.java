// Copyright 2019 ManOf Logan. All Rights Reserved.
package com.krishnanand.vida;

/**
 *
 */
public class SaddlePoint {

  public int solution(int[][] A) {
    // write your code in Java SE 8
    if (A == null || A.length <= 2|| A[0].length <= 2) {
      return -1;
    }
    int counter = 0;
    int len = A.length;
    int width = A[0].length;
    for (int i = 1; i < (len - 1); i++) {
      int minRow = Integer.MAX_VALUE;
      int minCol = -1;
      int maxRow = Integer.MIN_VALUE;
      int maxCol = -1;
      for (int j = 1; j < (width - 1); j++) {
        if (A[i][j] < A[i][j - 1] && A[i][j] < A[i][j + 1]) {
          if (A[i][j] < minRow) {
            minRow = A[i][j];
            minCol = j;
          }
        }
        if (A[i][j] > A[i][j - 1] && A[i][j] > A[i][j + 1]) {
          if (A[i][j] > maxRow) {
            maxRow = A[i][j];
            maxCol = j;
          }
        }

        boolean isSaddlePoint = true;
        if (minCol >= 0 && (A[i][minCol] <= A[i - 1][minCol] || A[i][minCol] <= A[i + 1][minCol])) {
          isSaddlePoint = false;
        } else if (maxCol >= 0  && (A[i][maxCol] >= A[i - 1][maxCol] || A[i][maxCol] >= A[i + 1][maxCol])) {
          isSaddlePoint = false;
        }
        if (isSaddlePoint) {
          counter ++;
        }
        // Reset
        if (minCol > 0) {
          minCol = -1;
          minRow = Integer.MAX_VALUE;
        } else if (maxCol > 0) {
          maxRow = Integer.MIN_VALUE;
          maxCol = -1;
        }
      }
    }
    return counter;
  }


  public static void main(String[] args) {
    int[][] matrix = new int[][] {
        new int[] {0, 1, 9, 3},
        new int[] {7, 5, 8, 3},
        new int[] {9, 2, 9, 4},
        new int[] {4, 6, 7, 1}
    };
    SaddlePoint saddlePoint = new SaddlePoint();
    System.out.println(saddlePoint.solution(matrix));

  }
}
