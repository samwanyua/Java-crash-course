class Book{
    public String title;
    private String author;
    public static String staticAttribute = "My static attribute"; //belongs to book class. Class level attribute

    
    // public Book(){
    //     this.title = "No title";
    //     this.author = "No author";
    // }

    //this is a constructor
    public Book(String title, String author){
        this.title = title;
        this.setAuthor(author); 
    }
    public void  readBook(){
        System.out.println("Reading " + this.title + " by " + this.author);
    }

    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
}


public class Getters {
    public static void main (String [] args){
         //constructors
         Book book2 = new Book("Not Yet Married", "Marshall Segal");
         System.out.println(book2.title);
 
         Book book3 = new Book("Meaning of Marriage", "Timothy Keller");
         System.out.println(book3.getAuthor());
     }
}
