package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(validPhoneNumber.test("+918495841514"));
        System.out.println(validPhoneNumber.test("+91849584154514"));
        System.out.println(validPhoneNumber.test("+9184958414"));
        System.out.println();
        System.out.println(validPhoneNumber.and(numHaving3).test("+918495841513"));
        System.out.println(validPhoneNumber.and(numHaving3).test("+91849841513"));
        System.out.println(validPhoneNumber.or(numHaving3).test("2918495841513"));

    }
    static Predicate<String> validPhoneNumber = phoneNumber -> phoneNumber.startsWith("+91") && phoneNumber.length()==13;
    static Predicate<String> numHaving3 = phonenumber -> phonenumber.contains("3");
}
