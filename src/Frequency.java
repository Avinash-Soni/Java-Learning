import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {
    public static void main(String[] args) {

//        List <Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(1);
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.println(Collections.frequency(list,1));

        //I will use second method

        List <Integer> list = Arrays.asList(1,2,3,4,5,1,6,7,8,9,1);
        System.out.println(list);
        System.out.println(Collections.frequency(list, 1));
    }
}
