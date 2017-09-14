package com.example;

public class Series {
  public static int sum(int n) {
    int sum = 0;

    for (int i = 0; i <= n; i++) {
      sum += i;
    }

    return sum;
  }

  public static int factorial(int n) {
    int sum = 1;

    for (int i = 1; i <= n; i++) {
      sum *= i;
    }

    return sum;
  }
}
