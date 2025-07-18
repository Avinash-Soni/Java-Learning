public class Overloading {

    int add(int a , int b){
        return a+b;
    }

    int add(int a, int b,int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();

        System.out.println("Sum of two integer : "+obj.add(4,5));
        System.out.println("Sum of three integer : "+obj.add(2,3,5));
        System.out.println("Sum of two double : "+obj.add(2.5,4.7));
    }
}
