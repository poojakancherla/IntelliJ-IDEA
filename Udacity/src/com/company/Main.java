package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    System.out.println("Enter the marks:");
    Scanner s = new Scanner(System.in);
    int marks = s.nextInt();
    if(marks<50)
        System.out.println(marks + " is bad");

    else
        System.out.println(marks + " is good");
    }
}
