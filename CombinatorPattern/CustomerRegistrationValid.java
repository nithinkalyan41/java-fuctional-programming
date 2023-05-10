package CombinatorPattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import  static CombinatorPattern.CustomerRegistrationValid.ValidationResult;
import  static CombinatorPattern.CustomerRegistrationValid.ValidationResult.*;

public interface CustomerRegistrationValid extends Function<Customer, ValidationResult> {
     static  CustomerRegistrationValid isEmailValid(){
         return customer -> customer.getEmail().contains("@") ? SUCCESS : EMAIL_NOT_VALID;
     }
     static CustomerRegistrationValid isPhoneValid(){
         return customer -> customer.getPhoneNumber().startsWith("+91") ? SUCCESS : PHONE_NUMBER_NOT_VALID;
     }
     static CustomerRegistrationValid isAdult(){
         return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 18 ? SUCCESS : NOT_AN_ADULT;
     }
     default CustomerRegistrationValid and (CustomerRegistrationValid other){
         return customer -> {
             ValidationResult result = this.apply(customer);
             return result.equals(SUCCESS) ? other.apply(customer) : result;
         };
     }

    enum ValidationResult{
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        NOT_AN_ADULT
    }
}
