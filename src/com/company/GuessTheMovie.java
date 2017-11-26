package com.company;

import java.util.*;
import java.io.File;

// importing File

public class GuessTheMovie
{
    public static void main(String[] args) throws Exception
    {
        List<String> movies = new ArrayList<>();
        File f = new File("Movies.txt");
        Scanner s = new Scanner(f);
        Scanner scanner = new Scanner(System.in);

        while(s.hasNextLine())
        {
            String line = s.nextLine();
            movies = Arrays.asList(line.split(","));
        }

        // Choosing a random movie
        String test = movies.get((int)Math.random()*movies.size());


       // converting into underscore
        String blank = "";
        for (int i = 0; i < test.length(); i++)
        {
            blank += "_";
        }


        System.out.println(test);




        int chances = 10;


        do {

            System.out.println("Guess a letter");
            char guess = scanner.next().charAt(0);
//            System.out.println(guess);

            int index = test.indexOf(guess);


            ArrayList<Integer> location = new ArrayList<Integer>();

            if (index>0)
            {
                location.add(index);
            }
            else
            {
                --chances;
            }

            int i = 1;

            while(index >= 0) {
                index = test.indexOf(guess, index+1);
                location.add(index);
                i++;
            }

            for (int j = 0; j < location.size(); j++) {
                if (location.get(j) >= 0) {
                    char[] tempBlank = blank.toCharArray();

                    tempBlank[location.get(j)] = guess;
                    blank = String.valueOf(tempBlank);


                }

            }

            System.out.println(blank + " Chances left: " + chances);


        }while(blank != test && chances>0);










    }

}
