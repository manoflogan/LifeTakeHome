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
public class ElevatorTest {
  private Elevator elevator;

  @BeforeMethod
  public void setUp() {
    this.elevator = new Elevator();
  }

  @AfterMethod
  public void tearDown() {
    this.elevator = null;
  }

  @Test
  public void testUseCaseOne() {
    MatcherAssert.assertThat(this.elevator.solution(new int[] {60, 80, 40}, new int[] {2, 3, 5}, 5
        , 2,
        200), Matchers.is(5));
  }
}
