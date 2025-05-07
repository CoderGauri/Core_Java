package com.besant.packages.operators;

public class LogicalOperators {
    public static void main(String[] args) {
        //condition with  or operator
        boolean aadhar = true;
        boolean pan = false;
        boolean drvingLicense = false;
        boolean electionId = false;
        if (aadhar || pan || drvingLicense || electionId) {
            System.out.println("elegible for casting vote");
        } else {
            System.out.println("Not elegible for casting vote");
        }
        if (!aadhar) {
            System.out.println("Not elegible for casting vote");
        } else {
            System.out.println("elegible for casting vote");
        }
        //check if the alphabet is a vowel
        char ch = 'i';

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is vowel");

        } else {
            System.out.println(ch + " is not a vowel ");
        }

        int inputNumber = 1;
        if (inputNumber == 0) {
            System.out.println(inputNumber + " neither positive nor negative");
        } else if (inputNumber > 0) {
            System.out.println(inputNumber + "is positive");
        } else {
            System.out.println(inputNumber + "is negative");
        }


    }}



