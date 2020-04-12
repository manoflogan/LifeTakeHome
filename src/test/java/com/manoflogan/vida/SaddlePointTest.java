// Copyright 2020 ManOf Logan. All Rights Reserved.
package com.manoflogan.vida;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 */
public class SaddlePointTest {

  private SaddlePoint saddlePoint;

  @BeforeMethod
  public void setUp() {
    this.saddlePoint = new SaddlePoint();
  }

  @AfterMethod
  public void tearDown() {
    this.saddlePoint = null;
  }

  @Test
  public void testOne() {
    int[][] matrix = new int[][] {
        new int[] {0, 1, 9, 3},
        new int[] {7, 5, 8, 3},
        new int[] {9, 2, 9, 4},
        new int[] {4, 6, 7, 1}
    };
    MatcherAssert.assertThat(this.saddlePoint.solution(matrix), Matchers.is(2));
  }
}
