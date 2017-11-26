package com.company;
import java.util.Scanner;
import java.io.File;

public class WordCount {
    public static void main(String[] args) throws Exception {
        String pathname;
        int total = 0;
        File f = new File("Story.txt");
        Scanner s = new Scanner(f);
        while (s.hasNextLine()){
            String line = s.nextLine();
            total += line.split(" ").length;

        }

        System.out.println(total);
    }
}
