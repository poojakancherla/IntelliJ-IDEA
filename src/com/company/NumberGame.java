package com.company;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        int randNum = (int)(Math.random()*100)+1;
        boolean hasWon = false;
        System.out.println("I have generates the random numb. Please guess a number");
        Scanner s = new Scanner(System.in);
        for (int i=10; i>0; i--){
            System.out.println("You have "+i+" guesses left. Choose again");
            int guess = s.nextInt();

            if(randNum < guess)
                System.out.println("Your number is less than "+ guess);
            else if(randNum > guess)
                System.out.println("Your number is greater than "+ guess);
            else {
                hasWon = true;
                break;
            }
        }
        if(hasWon)
            System.out.println("You have won");
        else
            System.out.println("Game over. You loose. The number is "+randNum);


    }
}
