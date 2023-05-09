package functionalinterface;

import java.util.function.BiConsumer;

public class _BiConsumer {
    public static void main(String[] args) {
        Customer customer = new Customer("rock","1548651564");

                greetConsumer.accept(customer,false);
    }
    static BiConsumer<Customer,Boolean> greetConsumer = (customer,showPhoneNumber) ->
            System.out.println("Hello "+customer.customerName+" Your Mobile Number "
                    +(showPhoneNumber ? customer.customerPhoneNumber : "*************"));

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
