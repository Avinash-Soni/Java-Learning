package Functional_Programming;

import java.util.List;

public class forEach {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,2,3,4,5,6,7,8,9,12,43,56,37,87,99,86);
         number.stream()
                .filter(num ->num%2==0)
                .forEach(num -> System.out.println(num));
    }
}
