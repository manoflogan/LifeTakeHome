// Copyright 2020 ManOf Logan. All Rights Reserved.
package com.manoflogan.vida;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Unit test for {@link DecimalZip}
 */
public class DecimalZipTest {

  private DecimalZip decimalZip;

  @BeforeMethod
  public void setUp() {
    this.decimalZip = new DecimalZip();
  }

  @AfterMethod
  public void tearDown() {
    this.decimalZip = null;
  }

  @Test
  public void testUseCaseOne() {
    MatcherAssert.assertThat(this.decimalZip.solution(12, 56), Matchers.is(1526));
  }

  @Test
  public void testUseCaseTwo() {
    MatcherAssert.assertThat(this.decimalZip.solution(56, 12), Matchers.is(5162));
  }

  @Test
  public void testUseCaseThree() {
    MatcherAssert.assertThat(this.decimalZip.solution(12345, 678), Matchers.is(16273845));
  }
}
