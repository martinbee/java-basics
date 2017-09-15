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

  public static int fibonacci(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;

    return ((n - 1) + (n - 2));
  }
}
