package functionalinterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        //greetCustomer(new Customer("rock","8748965"));
        Customer customer = new Customer("rock","145628774");
        greetConsumerCustomer.accept(customer);
    }
    static void greetCustomer(Customer customer){
        System.out.println("Hello "+customer.customerName+" Thanks for registering "+customer.customerPhoneNumber);
    }
    static Consumer<Customer> greetConsumerCustomer = customer ->
            System.out.println("Hello "+customer.customerName+" Thanks for registering "+customer.customerPhoneNumber);
    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;
        Customer(String customerName,String customerPhoneNumber){
            this.customerName=customerName;
            this.customerPhoneNumber=customerPhoneNumber;
        }
    }
}
