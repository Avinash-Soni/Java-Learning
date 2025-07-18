public class ArraytoString {
    public static void main(String[] args) {
        String[] array = new String[]{"Java","Practice","is","done."};

        StringBuilder sb = new StringBuilder();

        //for each loop
        for (String str:array){
           sb.append(str) .append(" ");
        }
        System.out.println(sb);
    }
}
