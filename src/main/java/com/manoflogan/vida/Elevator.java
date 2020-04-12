// Copyright 2019 ManOf Logan. All Rights Reserved.
package com.manoflogan.vida;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 *
 */
public class Elevator {

  public int solution(int[] A, int[] B, int M, int X, int Y) {
    // write your code in Java SE 8
    int start = 0;
    int end = A.length;
    int count = 0;
    Queue<Integer> queue = new ArrayDeque<>();
    while (start < end) {
      int weight = 0;
      while (weight <= Y && start < end && queue.size() < X) {

        if (weight + A[start] > Y) {
          break;
        }
        queue.offer(start);
        weight += A[start];
        start ++;

      }
      int size = queue.size();
      Map<Integer, Integer> floorToPassengerMapping = new HashMap<>();
      int index = 0;
      while (!queue.isEmpty()) {
        int passenger = queue.poll();
        floorToPassengerMapping.put(B[passenger],
            floorToPassengerMapping.getOrDefault(B[passenger], 0) + 1);
        //queue.offer(passenger);
        index ++;
      }
      count += floorToPassengerMapping.size() + 1; // Total number of stops + 1 for return to ground floor.
      queue.clear();

    }
    return count;
  }

  public static void main(String[] args) {
    Elevator elevator = new Elevator();
    System.out.println(
        elevator.solution(new int[] {60, 80, 40}, new int[] {2, 3, 5}, 5, 2, 200));
  }
}
