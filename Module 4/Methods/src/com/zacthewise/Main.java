package com.zacthewise;

public class Main {

    public static void main(String[] args) {
        // this is the main method
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // public and static are keywords
        // void is another keyword that specifies that the method doesn't return anything
        // if you want to return a value, change void to data return type
        // if the method is not void, then you must specify what is returned by the method in
        // all possible cases
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score " + finalScore);
            return finalScore; // returns the final score, like in python, once the return is
            // specified, the method ends
        }

        return -1; // negative 1 == error in programming terms
    }

}
