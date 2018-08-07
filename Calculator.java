package com.mycompany.test;

  public class Calculator{

    public static void main(String[] args){
      int a=4;
      int b=2;
      System.out.printIn(sum(a,b));
      System.out.printIn(minus(a,b));
    }


  private static int sum(int a, int b){
    return a+b;
  }

  private static int minus(int a, int b){
    return a-b;
  }
}
