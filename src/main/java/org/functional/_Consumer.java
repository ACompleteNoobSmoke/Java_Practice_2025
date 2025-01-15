package org.functional;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer Victoria = new Customer("Victoria Marshall", "Event Planner Assistance");
        greetCustomer(Victoria);
        greetCustomerConsumer.accept(Victoria);
    }

    static Consumer<Customer> greetCustomerConsumer = _Consumer::greetCustomer;

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName);
        System.out.println("Occupation: " + customer.customerOccupation);
    }

    static class Customer {
        private final String customerName;
        private final String customerOccupation;

        public Customer(String customerName, String customerOccupation) {
            this.customerName = customerName;
            this.customerOccupation = customerOccupation;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "customerName='" + customerName + '\'' +
                    ", customerOccupation='" + customerOccupation + '\'' +
                    '}';
        }
    }
}
