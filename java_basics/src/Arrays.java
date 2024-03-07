import java.util.ArrayList;

public class Arrays {
    public static void main(String [] args){
        // Arrays
    int [] luckNumbers = {4,8,15,16,23,42};

    //modify
    luckNumbers[2] =  90;
    System.out.println(luckNumbers[2]);


    System.out.println(luckNumbers.length);

    // N Dimensional arrays
    int [][] numberGrid = {{1,3}, {3,2}};
    System.out.println(numberGrid[1][1]);

    // Arraylist
    ArrayList<String> friends = new ArrayList<String>();
    friends.add("Oscar");
    friends.add("Hesbon");
    friends.add("Muoki");

    friends.remove("Oscar");
    System.out.println(friends.toString());
    System.out.println(friends.get(0));
    System.out.println(friends.contains("Oscar"));
    System.out.println(friends.size());

    




    
    }
    
}
