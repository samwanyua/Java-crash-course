public class Conditions {
    public static void main(String [] args){
        // Conditions
        boolean isStudent = true;
        boolean isSmart = true;

        if(isSmart && !isStudent){
            System.out.println("You are a student");
        }
        else if(isStudent && isSmart){
            System.out.println("You are not a student");
        }
        else{
            System.out.println("You are not a student and did not meet our targets");
        }

        if(1 < 3){
            System.out.println("Number comparison was true!");
        }
        
        if('a' < 'b'){
            System.out.println("Character comparison was true");
        }

        if(!"dog".equals("cateeew")){
            System.out.println("String comparison was true");
        }
    }
}
