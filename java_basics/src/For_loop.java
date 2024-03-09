public class For_loop {
    public static void main(String [] args){
        // for loops
        for(int i = 0; i <= 10; i++){
            System.out.println(i + " This is a for loop");
        }

        int luckyNums [] = {4,8,15,16,23,42};
        for(int luckyNum : luckyNums){
            System.out.println(luckyNum);
        }
    }
}
