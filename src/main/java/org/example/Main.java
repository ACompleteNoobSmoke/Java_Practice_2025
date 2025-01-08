package org.example;

import org.acompletenoobsmoke.Person;

import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    Person[] people = null;

    public void setPeople(int amount) {
        this.people = new Person[amount];
    }

    public void enterPerson(){
        System.out.print("Enter Amount Of People: ");
        int peopleAmount = Integer.parseInt(scanner.nextLine());
        System.out.println();
        setPeople(peopleAmount);
        for (int i = 0; i < peopleAmount; i++){
            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter Occupation: ");
            String occupation = scanner.nextLine();
            System.out.print("Enter Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            people[i] = new Person(firstName, lastName, occupation, age);
            System.out.println(" ");
        }
    }

    public void printPeople(){
        if (people == null || people.length == 0){
            System.out.println("People List is Empty");
        }

        for (Person person : people){
            System.out.println(person);
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.enterPerson();
        main.printPeople();
        main.scanner.close();
    }
}