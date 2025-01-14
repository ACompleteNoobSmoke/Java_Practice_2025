package org.example;

import jdk.jshell.spi.SPIResolutionException;
import org.acompletenoobsmoke.Person;

import java.util.Scanner;

public class Main {


    public double getAnnualRentalIncome(double monthly_income){
        return monthly_income * 12;
    }

    public double getRentalYield (double rental_income, double propertyPrice) {
        return (rental_income / propertyPrice) * 100;
    }

    private void hell() {

    }
    public static void main(String[] args) {
        Main main = new Main();

        double rental_income = main.getAnnualRentalIncome(1300);
        double rentalYield = main.getRentalYield(rental_income, 250000);
        System.out.print("Answer: " + Math.round(rentalYield) + "%");

    }
}