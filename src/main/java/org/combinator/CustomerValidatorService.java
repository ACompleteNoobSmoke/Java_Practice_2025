package org.combinator;

import org.acompletenoobsmoke.Customer;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Predicate;

public class CustomerValidatorService {

    private final Predicate<Customer> isEmailValid = customer -> customer.getEmail().contains("@");

    private final Predicate<Customer> isPhoneNumberValid = customer -> customer.getPhoneNumber().startsWith("+1");

    private final Predicate<Customer> isAdult = customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 18;

    public boolean validateAll(Customer customer) {
        return isEmailValid.and(isPhoneNumberValid).and(isAdult).test(customer);
    }

}
