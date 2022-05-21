package com.zacthewise;

public class Main {

    public static void main(String[] args) {

        int myVariable = 50;
        // myVariable = 50 is the variable part
        // the whole line is the statement

        System.out.println("Statements don't " +
                "have to be on the " +
                "same line"); // break up the code if it's too
                              // long
        int anotherVariable = 5; myVariable --; // multiple statements in one line
        // (not recommended but still possible)

        // white space is used to seperate things, extra white space is auto-deleted by java
        int        myWhiteSpaceVariable
                  =
                          50
        ;
        System.out.println(myWhiteSpaceVariable);

        // indentation
        // tabbing for more readability
        // indentation doesn't seem to be required like in python

    }

}
