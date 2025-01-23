package org.generic;

import org.acompletenoobsmoke.Customer;

import java.time.LocalDate;

public class GenericClass<T> {

    private final T testObject;

    public GenericClass(T testObject) {
        this.testObject = testObject;
    }

    public String toString(){
        return testObject.toString();
    }

    public static void main(String[] args) {
//        Customer newCustomer =
//                new Customer("Osaretin", "oo@gmail", "8989", LocalDate.of(1995, 3,19));
//        GenericClass<Customer> customerGenericClass = new GenericClass<>(newCustomer);
//        System.out.println(customerGenericClass);
//        GenericClass<Integer> integerGenericClass = new GenericClass<>(20);
//        System.out.println(integerGenericClass);

        String[] games = {"SSX 3", "Burnout 3", "UFC Undisputed 3"};
        Character[] letters = {'A', 'B', 'C'};
        print(games);
        print(letters);
    }

    static <T> void print (T[] array) {
        for (T type: array) {
            System.out.println(type.getClass().getName() + " - " + type);
        }
    }
}
