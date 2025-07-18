package enums;

public class PrintDay {
    public static void main(String[] args) {
        System.out.println("Printing all the day.");
//        System.out.println(Day.Sunday);
//        System.out.println(Day.Monday);
//        System.out.println(Day.Tuesday);
//        System.out.println(Day.Wednesday);
//        System.out.println(Day.Thursday);
//        System.out.println(Day.Friday);
//        System.out.println(Day.Saturday);

        for (Day value : Day.values()) {
            System.out.println(value);
        }

        for (Day value : Day.values()) {
            System.out.printf("%s : %s\n",value,value.getType());
        }
    }
}
