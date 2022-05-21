package com.zacthewise;

public class Main {

    public static void main(String[] args) {
        // https://en.wikipedia.org/wiki/List_of_Java_keywords
        // keywords can't be used as variables
        // i.e int int = 5; won't work
        // int int1 = 5; will work

        // expressions
        // building blocks of java programs
        // a mile is equal to 1.6 kilometres
        double kilometres = (100 * 1.6);
   //   ^kwrd  ^expression^^^^^^^^^^^^

        int score = 50;
        if ( score == 50 ) {
            // within the brackets is the expression part
            System.out.println("This is an expressions (and a method)");
        }

    }
}
