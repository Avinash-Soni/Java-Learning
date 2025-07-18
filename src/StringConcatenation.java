public class StringConcatenation {
    public static void main(String[] args) {
        String firstName = "Avinash";
        String lastName = "Soni";

        //String fullName = firstName+" "+lastName;
        String fullName = firstName.concat(" ").concat(lastName);

        //"%S" for UpperCase "%s" for lowerCase
        //%d for integer
        //System.out.printf("Full name is : %S",fullName);
        System.out.println("Full name is : "+fullName.toUpperCase());
    }
}
