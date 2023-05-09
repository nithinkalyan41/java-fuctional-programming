package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Bifunction {
    public static void main(String[] args) {
        System.out.println(incrementByOneAndMul.apply(4,100));
    }
    static BiFunction<Integer,Integer,Integer> incrementByOneAndMul =
            (incrementNumByOne,numberToMultiply)
            -> (incrementNumByOne+1) * numberToMultiply;
}
