package CombinatorPattern;

import java.time.LocalDate;
import static CombinatorPattern.CustomerRegistrationValid.*;

public class Main {
    public static void main(String[] args) {
            Customer customer = new Customer(
                    "john",
                    "jhonnylawernce@gmail.com",
                    "+91485884846",
                    LocalDate.of(2001,1,1)
            );
        //System.out.println(new CustomerValidationService().isValid(customer));
        ValidationResult result = isEmailValid()
                .and(isPhoneValid())
                .and(isAdult()).apply(customer);
        if(result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
        else{
            System.out.println(result);
        }

    }
}
