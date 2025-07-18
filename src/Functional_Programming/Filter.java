package Chapter_13;

import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<String> strs = List.of("Avinash Soni","hello"," is the best Java Learner",
                " and now best Software Engineer","True");
        String result = strs.stream()
                .filter(str ->str.length()>10)
                .reduce("",(a,b)->a +""+ b);

        System.out.println(result);
    }
}
