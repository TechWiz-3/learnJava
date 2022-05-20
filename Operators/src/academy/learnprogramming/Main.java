package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

//        int result = 1 + 2; // 1 + 2 = 3
//        System.out.println(result);
//        int previousResult = result - 1;    // 3 - 1 = 2
//        System.out.println(previousResult);
//
//        result = result * 10; // 3 * 10 = 30
//        System.out.println(result);
//
//        result = result / 5;    // 20 / 5 = 4
//        System.out.println(result);
//
//        result = result % 4;    // the remainder of (4 % 3)
//        System.out.println(result);

//        int result = 1;
//        result = result + 1;    // 1 + 1 = 2
//        result ++;  // 2 + 1 = 3
//        result --;  // 3 - 1 = 2
//        result += 2;    // 2 + 2 = 4
//        result *= 2;    // 4 * 2 = 8
//        result /= 8;    // 8 / 8 = 1
//        System.out.println(result);


        // FLOW CONTROL
//        boolean isAlien = false;    // similar 'return' oriented structures to python
//        if (!isAlien) {  // if true
//            System.out.println("Not alien (lol)");
//            System.out.println("ayo");
//        }   // always use code blocks

        // More flow control
//        int topScore = 100;
//        if (topScore == 100) {
//            System.out.println("You have achieved the top level");
//        }

//        int topScore = 80;
//        int secondTopScore = 81;
//        if (( topScore < secondTopScore ) && topScore < 100 ) {
//            System.out.println("You beat your top score but are still under 100");
//        }
//        if (( topScore > 90 ) ||  secondTopScore <= 90 ) {
//            System.out.println("Either or both of the conditions are true");
//        }

//        boolean isCar = false;
//        if ( isCar ) {
//            System.out.println("It is a car");
//        }
//
//        boolean wasCar = isCar ? true : false;
//        // shortcut of if else
//        int wasCar2 = isCar ? 1 : 3; // basically saying if isCar == true, wasCar2 = 1. else wasCar2 = 3
//        System.out.println(wasCar2);
//        if ( wasCar2 == 3 ) {
//            System.out.println("was car is true");
//        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = ageOfClient == 20 ? true: false;
        System.out.println(isEighteenOrOver);
    }
}
