import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

    void collectionSort(List<String> stringlist){
         Collections.sort(stringlist);
    }

    public static void main(String[] args) {
        CollectionSort cs = new CollectionSort();
        List<String> l = new ArrayList<>();
        l.add("Guava");
        l.add("Apple");
        l.add("Mango");
        l.add("Pineapple");

        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i)+" ");
        }

        cs.collectionSort(l);

        System.out.println("\n After sorting");

        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i)+" ");
        }

    }
}
