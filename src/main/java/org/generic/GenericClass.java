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
        Customer newCustomer =
                new Customer("Osaretin", "oo@gmail", "8989", LocalDate.of(1995, 3,19));
        GenericClass<Customer> customerGenericClass = new GenericClass<>(newCustomer);
        System.out.println(customerGenericClass);
        GenericClass<Integer> integerGenericClass = new GenericClass<>(20);
        System.out.println(integerGenericClass);
    }
}
