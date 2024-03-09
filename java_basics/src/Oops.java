class Book{
    public String title;
    public String author;
    public static String staticAttribute = "My static attribute"; //belongs to book class. Class level attribute

    //this is a constructor
    public Book(){
        this.title = "No title";
        this.author = "No author";
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public void  readBook(){
        System.out.println("Reading " + this.title + " by " + this.author);
    }
}


public class Oops {
    public static void main (String [] args){
       /*  Book book1 = new Book(); //new object
        book1.title = "Harry Potter";
        book1.author = "JK BOwling";

        book1.readBook();
        System.out.println(book1.author);
        System.out.println(Book.staticAttribute);
    */

        //constructors
        Book book2 = new Book("Not Yet Married", "Marshall Segal");
        System.out.println(book2.title);

        Book book3 = new Book("Meaning of Marriage", "Tim Keller");
        System.out.println(book3.author);
    }
}
