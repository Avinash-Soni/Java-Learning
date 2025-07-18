package Chapter_13;

import java.util.function.BinaryOperator;

public class LambdaMultiplication {
    public static void main(String[] args) {
        BinaryOperator<Integer> mul = (a,b) -> a*b;
        int result  = mul.apply(5,4);
        System.out.println(result);
    }
}
