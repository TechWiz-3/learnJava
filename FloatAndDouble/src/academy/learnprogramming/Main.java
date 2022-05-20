package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // double = width of 64
        // float = width of 32
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloat);
        System.out.println("Float minimum value = " + myMaxFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDouble);
        System.out.println("Doubel minimum value = " + myMaxDouble);

        int myIntValue  = 5/2;
        float myFloatValue = 5f/2f;
        double myDoubleValue = 5.00/2.00;

        float pounds = 29.9f;
        double result = pounds * 0.453592;
        System.out.println(result);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println(convertedKilograms);
    }
}
