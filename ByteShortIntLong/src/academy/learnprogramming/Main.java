package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
//        int myMinIntValue = Integer.MIN_VALUE;
//        int myMaxIntValue = Integer.MAX_VALUE;
//        System.out.println("Integer Minimum Value: = " + myMinIntValue);
//        System.out.println("Integer Maximum Value = " + myMaxIntValue);
//        System.out.println("Busted MAX Value: " + (myMaxIntValue + 1)); // overflow
//        System.out.println(Integer.BYTES);
//        System.out.println("Busted min value: " + (myMinIntValue - 1)); // overflow
//
//        int intLikePythonLol = 2_147_836_48;

//        byte myMinByteValue = Byte.MIN_VALUE;
//        byte myMaxByteValue = Byte.MAX_VALUE;
//        System.out.println("Byte min = " + myMinByteValue);
//        System.out.println("Byte max = " + myMaxByteValue);

//        short myMinShortValue = Short.MIN_VALUE;
//        short myMaxShortValue = Short.MAX_VALUE;
//        System.out.println("Short min = " + myMinShortValue);
//        System.out.println("Short max = " + myMaxShortValue);

//        long myLongValue = 9223372036854775807L;
//        long myMaxLongValue = Long.MAX_VALUE;
//        long myMinLongValue = Long.MIN_VALUE;
//        System.out.println(myLongValue + " " + myMaxLongValue + " - " + myMinLongValue);

//        short bigShortLiteralValue = 32767; // 32767 is short max

        // byte = 8 bit (yes we know that lol)
        // width of 8
        // short = 16 bits; width of 16
        // int = 32 bits; width of 32

//        byte myMinByteValue = Byte.MIN_VALUE;
//        byte myNewByteValue = (byte) (myMinByteValue / 2);
//        System.out.println(myNewByteValue);

//        short myMinShortValue = Short.MIN_VALUE;
//        short myNewShortValue = (short) (myMinShortValue / 2);
//        System.out.println(myNewShortValue);

        // Challenge (yeahboi)
        byte myByte = 122;
        short myShort = 22737;
        int myInt = 30_000;
        long myLongyyy = (5000 + (10 * (myShort + myByte + myInt)));
        System.out.println(myLongyyy);
    }
}
