package Functional_Programming;

import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<String> names = List.of("Avinash","Zyra","Soni");
                names.stream()
                        .forEach(name -> System.out.println(name));
    }
}
