package com.zacthewise;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        if ( score == 5000 ) { // empty if statements aren't a problem in java apparently
//            // use code blocks people
//            System.out.println("Your score is 5000");
//            System.out.println("This was executed");
//        }

        if ( score == 400 )
            System.out.println("Crappy if statement coz no code block");
        // lesson: codeblocks are good, use them (we get it bruh lol)

        // if, elif, else (finally)

        if ( score < 5000 && score > 1000 ) {
            System.out.println("Your score is less than 5000");
        } else if (score < 1000) {
            System.out.println("Your score is less than 1000");
        } else { // this syntax is scary lol
            System.out.println("Got here");
        }


    }
}
