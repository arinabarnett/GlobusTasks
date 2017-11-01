package com.company;

import java.io.IOException;
import java.util.Scanner; 

public class Main {

  public static void main(String[] args) throws IOException {
    int a;
    int b;
    int c;
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter your number: ");
    a = reader.nextInt();
    System.out.println("Enter the second number: ");
    b = reader.nextInt();
    System.out.println("Enter the last number: ");
    c = reader.nextInt();
    System.out.println("This is the answer: ");
    System.out.println(a+b+c);
    
    reader.close();
  }
