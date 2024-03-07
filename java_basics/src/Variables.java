public class Variables {
    public static void main(String [] args){
        // variables and data types
        String name = "Mike";
        System.out.println(name);
        char testGrade = 'A';
        System.out.println(testGrade);

        byte age0 = 0; // 8-bit signed two's complement integer
        short age1 = 13; // 16-bit signed two's complement integer
        int age2 = 20; // 32-bit signed two's complement integer
        long age3 = 23L; //64-bit optionally signed two's complement integer

        float gpa0 = 2.5f; //32-bit floating point
        double gpa = 3.5; //double-precision 64-bit floating point

        boolean isTall; //1-bit -> true/false
        isTall = true;
        System.out.println(isTall);

        /*
         * %s: String
            %d: Decimal (integer)
            %f: Floating-point
            %c: Character
            %b: Boolean
            %n: Newline (platform-independent)

            %f: Default format for a double.
            %.2f: Formats with two decimal places.
            %10.4f: Formats with a width of 10 characters and four decimal places.
            %-10.2f: Left-justified with a width of 10 characters and two decimal places.
            %e: Formats using scientific notation.
            %,.2f: Adds a grouping separator (comma) for better readability.
         */

        System.out.println("Your name is " + name );
        System.out.printf("Your name is  %s and you are %d\n", name, age2 );

        System.out.printf("Hello, %s! Your GPA is %10.2f", name,gpa);
    }
}
