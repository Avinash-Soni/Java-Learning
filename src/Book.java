

public class Book {

    static int totalnoofbook;

    String author;
    String title;
    String isbn;
    boolean isBorrowed;

    static {
        totalnoofbook = 0;
    }
    {//object init
        totalnoofbook++;
    }

    Book(String isbn,String title,String auther){
        this.author=auther;
        this.isbn=isbn;
        this.title=title;
    }
    Book(String isbn){
        this(isbn,"unknown","unknown");
    }

    static int getTotalnoofbook(){
        return totalnoofbook;
    }

    void borrowBook(){
        if (isBorrowed){
            System.out.println("Book is already borrowed");
        }else{
            this.isBorrowed = true;
            System.out.println("Enjoy the Book");
        }
    }
    void returnBook(){
        if (isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed");
        }else {
            System.out.println("This book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book designOfThing = new Book("1","Design","Author");
        Book design = new Book("2","Design","Author");
        System.out.println(getTotalnoofbook());
        designOfThing.borrowBook();
        design.borrowBook();
        designOfThing.borrowBook();
        designOfThing.returnBook();
        designOfThing.returnBook();

    }

}
