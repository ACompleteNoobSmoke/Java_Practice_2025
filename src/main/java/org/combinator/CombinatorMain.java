package org.combinator;

import org.acompletenoobsmoke.Customer;
import static org.combinator.CustomerRegistrationValidator.*;
import static org.combinator.CustomerRegistrationValidator.ValidationResult.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CombinatorMain {

    final List<Customer> customerList;
    final CustomerValidatorService customerValidatorService;

    public CombinatorMain(){
        customerList = new ArrayList<>();
        customerValidatorService = new CustomerValidatorService();
    }

    public boolean saveCustomer (Customer newCustomer) {
        ValidationResult result = isEmailValid().and(isPhoneNumber()).and(isAdult()).apply(newCustomer);
        if (!SUCCESS.equals(result)) throw new IllegalStateException(result.name());
        return customerList.add(newCustomer);
    }

    public void printList () {
        customerList.forEach(System.out::println);
    }
    public static void main(String[] args) {
        CombinatorMain combinatorMain = new CombinatorMain();

        Customer newCustomer = new Customer(
                "Osaretin Omofonmwan",
                "OsoInfinite@gmail.com",
                "+12345892",
                LocalDate.of(1995, 3, 19)
        );

        Customer customerSammy = new Customer(
                "Sammy Uwensuyi",
                "sammydaboi@yahoo.com",
                "+013132412341",
                LocalDate.of(2011, 4, 29)
        );

        combinatorMain.saveCustomer(newCustomer);
        combinatorMain.saveCustomer(customerSammy);
        combinatorMain.printList();

    }
}
