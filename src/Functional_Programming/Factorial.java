package Functional_Programming;

import java.util.stream.IntStream;

public class Factorial {
    int factorial(int num){
        if (num == 0||num==1){
            return 1;
        }
        return num*factorial(num-1);
    }
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println(fact.factorial(5));

        //By functional programing
        IntStream.rangeClosed(2,5)
                //Reference
                //you can write .forEach(num -> System.out.println(num))
                //.forEach(System.out::println);
                .reduce((a,b)->a*b)
                .ifPresent(System.out::println);


    }
}
