package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // block text code lez go (also if you're reading this... why are you reading this?)
        // if someone is actually reading this I'm flattered tysm kind stranger
        double myDoubleOne = 20.00d;
        double myDoubleTwo = 80.00d;
        double operations = (myDoubleOne + myDoubleTwo) * 100;
        double remainder = operations % 40.00;
        System.out.println(remainder);
        boolean isZero = (remainder == 0.0) ? true : false;
        System.out.println(isZero);
        if ( isZero ) {
            System.out.println("It's zero");
        }

    }

}
