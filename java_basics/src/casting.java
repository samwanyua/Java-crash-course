public class casting {
    public static void main(String [] args){
        //casting and converting
        System.out.println((int)3.142341234 ); //double to int
        System.out.println((double)4234 ); // int to double

        //string to int
        int intFromString = Integer.parseInt("234");
        double doubleFromString = Double.parseDouble("324.234");

        System.out.println(2321 + intFromString);
        System.out.println(2321 + doubleFromString);





    }
}
