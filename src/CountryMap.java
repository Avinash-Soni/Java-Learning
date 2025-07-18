import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("India","New Delhi");
        map.put("Australia","Canberra");
        map.put("South Korea","Seoul");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Country name : ");
        String country = input.nextLine();

        if (map.containsKey(country)){
            System.out.printf("Capital of %s is %s.",country,map.get(country));
        }else {
            System.out.printf("Sorry,I don't Know the Capital of %s",country);
        }
    }
}
