import java.util.Random;
import java.util.Scanner;

public class Worstguess {
 
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random r= new Random();
        int secretNum= 1 + r.nextInt(10);
        System.out.println("THE WORST NUMBER GUESSING GAME EVER!!!");
        System.out.print("\nI'M THINKING OF A NUMBER FROM 1-10. "
                + "TRY TO GUESS! ");
        if(secretNum==input.nextInt()){
            System.out.println("U GOT IT! THE ANSWER IS "+secretNum+".");
        }else{
            System.out.println("SORRY THE CORRECT ANSWER IS "+ secretNum+".");
        }
    }
    
}

    

