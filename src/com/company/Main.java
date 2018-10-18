package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        boolean con = false;
        String in;
        Scanner kbin = new Scanner(System.in);

        while (con == false)
        {
            System.out.println("Type in a sentence and press ENTER. Type \"EXIT\" to end the program");
            in = kbin.nextLine();

            //Tests to see if user wants to exit program, if so it will change boolean to exit loop
            if (Objects.equals(in.toUpperCase(), "EXIT"))
            {
                con = true;
                System.out.println("Exiting...");
            }
            else
            {
                //adds "safe" string to end of string to prevent the problem with .split command with string at end of word
                in = in + "ooo";
                in = in.toUpperCase();

                //Removes all spaces in the string
                in = in.replaceAll(" ","");
                String sp[] = in.split("SA");
                System.out.println("There are " + (sp.length-1) + " occurrences." + "\n");
            }
        }

    }
}
