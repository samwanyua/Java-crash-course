import java.util.Scanner;

public class User_inpput {
    public static void main(String [] args){
        //Getting user input
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = keyboardInput.nextLine();
        System.out.println("Hello, " + username);
        // System.out.println(keyboardInput.hasNextLine());
        keyboardInput.close();
    }
}
