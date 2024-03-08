public class Switch {
    public static void main(String [] args){
        // Swtich statements
        char studentGrade = 'C';

        switch (studentGrade) {
            case 'A':
                System.out.println("Good job! Keep it up!");
                break;
            case 'B':
                System.out.println("You did amazing");
                break;
            case 'C':
                System.out.println("You performed fairly!");
                break;
            case 'D': 
                System.out.println("Please reach out1");
        
            default:
                System.out.println("Please enter a valid grade!");
        }
    }
}
