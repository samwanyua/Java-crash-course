public class Exceptions {
    public static void main(String [] args){
        // Exception catching
        // int division = 10/0;

        try{
            int division = 10 / 0;
            System.out.println(division);


        }catch(ArithmeticException e){
            System.out.println(e);
        }
        // throw new ArithmeticException("Can't add numbers");

    }
}
