public class UseOfToString {
    String name = "Jone";
    int age = 20;

    @Override
    public String toString() {
        return "UseOfToString{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        UseOfToString stu = new UseOfToString();
        // toString automatically call by object
        System.out.println(stu);
    }
}