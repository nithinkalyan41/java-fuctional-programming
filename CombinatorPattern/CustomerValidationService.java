package CombinatorPattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidationService {
   private boolean isEmailValid(String email){
       return email.contains("@");
   }
   private boolean isPhoneNumValid(String phoneNumber){
       return phoneNumber.startsWith("+91");
   }
   private boolean isAdult(LocalDate dob){
       return Period.between (dob,LocalDate.now()).getYears() > 18;
   }
   public boolean isValid(Customer customer){
       return isEmailValid(customer.getEmail()) && isAdult(customer.getDob()) && isPhoneNumValid(customer.getPhoneNumber());
   }
}
