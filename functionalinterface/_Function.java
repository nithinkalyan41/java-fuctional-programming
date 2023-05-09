package functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(incrementByOne(n));
        int second = incrementByOneF.apply(10);
        System.out.println(second);
        Function<Integer,Integer> addByOneAndMultiply =  incrementByOneF.andThen(multiplyByTen);
        int result = addByOneAndMultiply.apply(10);
        System.out.println(result);
    }
    static int incrementByOne(int n){
        return n+1;
    }
    static Function<Integer,Integer> incrementByOneF = number -> number+1;
    static Function<Integer,Integer> multiplyByTen = number -> number*10;
}
