public class ConcatenateString {

    String concatenate(String...str){
       StringBuilder sb = new StringBuilder();

       for(String string:str){
           sb.append(string).append(" ");
       }
       return sb.toString();
    }

    public static void main(String[] args) {
        ConcatenateString cs = new ConcatenateString();
        System.out.println(cs.concatenate("Hello", "Java"));
        System.out.println(cs.concatenate("I","am","very","happy","."));
    }
}
