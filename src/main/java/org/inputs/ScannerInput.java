package org.inputs;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerInput {

    private Scanner myScanner = new Scanner(System.in);

    public int getInteger() {
        int integerInput = 0;
        try {
            String numString = myScanner.next();
            integerInput = Integer.parseInt(numString);
        } catch (NumberFormatException e) {
            throw new InputMismatchException("Incorrect Input - Please Enter Numerical Values Only");
        }
        return integerInput;
    }

    public String getString() {
        return myScanner.next().trim();
    }

    public void closeScanner() {
        myScanner.close();
    }
}