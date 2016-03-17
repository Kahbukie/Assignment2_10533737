import java.util.Random;
import java.util.Scanner;
public class Threecard {

public static void main(String[] args) {
        Random r=new Random();
        int win=1+r.nextInt(3);
        Scanner input=new Scanner(System.in); 
        int ans=0;
        
        System.out.println(""
                + "You slide up to Fast Eddie's card table and plop down your cash.\n" +
                 "He glances at you out of the corner of his eye and starts shuffling.\n" +
                    "He lays down three cards.");
        System.out.println("\nWhich one is the ace?");
          System.out.println("");
            System.out.println("\t\t ##\t ##\t ##");
            System.out.println("\t\t ##\t ##\t ##");
            System.out.println("\t\t 1 \t 2 \t 3 \n");
        ans=input.nextInt();
        
        if(ans!=win){
            System.out.println("Ha! Fast Eddie wins again! The ace was card "
                                 + "number "+ win);
            card(win);
        }else{
            System.out.println("You nailed it! Fast Eddie reluctantly hands "
                                + "over your winnings, scowling.\n" );
            card(win);
        }
        
    }
    
    public static void card(int num){
        if(num==1){
            System.out.println("");
            System.out.println("\t\t AA\t ##\t ##");
            System.out.println("\t\t AA\t ##\t ##");
            System.out.println("\t\t 1 \t 2 \t 3 ");
        }
        else if(num==2){
            System.out.println("");
        System.out.println("\t\t ##\t AA\t ##");
        System.out.println("\t\t ##\t AA\t ##");
        System.out.println("\t\t 1 \t 2 \t 3 ");
        }
        else if(num==3){
            System.out.println("");
        System.out.println("\t\t ##\t ##\t AA");
        System.out.println("\t\t ##\t ##\t AA");
        System.out.println("\t\t 1 \t 2 \t 3 ");
        }
    }
    
}

    

