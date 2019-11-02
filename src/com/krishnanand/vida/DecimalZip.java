// Copyright 2019 ManOf Logan. All Rights Reserved.
package com.krishnanand.vida;

/**
 *
 */
public class DecimalZip {

  public int solution(int A, int B) {
    // write your code in Java SE 8
    String firstStr = Integer.toString(A);
    String secondStr = Integer.toString(B);
    int firstLen = firstStr.length();
    int secondLen = secondStr.length();
    int i = 0;
    int j = 0;
    StringBuilder sb = new StringBuilder();
    while (i < firstLen && j < secondLen) {
      sb.append(firstStr.charAt(i ++));
      sb.append(secondStr.charAt(j ++));
    }
    while (i < firstLen) {
      sb.append(firstStr.charAt(i ++));
      i++;
    }
    while (j < secondLen) {
      sb.append(secondStr.charAt(j ++));
    }
    return Integer.parseInt(sb.toString(), 10);


  }
}
