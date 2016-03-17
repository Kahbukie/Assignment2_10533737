import java.util.Random;
        
public class Diceroll
{
    public static void main( String[] args )
    {
        Random r = new Random();
        
        System.out.print(" HERE COMES THE DICE!");
        int Roll1 = 1 + r.nextInt(6);
        int Roll2 = 1 + r.nextInt(6);
        
        
        System.out.print("\nRoll #1:" + Roll1);
        System.out.println("\nRoll #2:" + Roll2);
        
        System.out.println(" the total is");
        System.out.println(Roll1 + Roll2);
        
        
        
        
        
    }
    
        
    
    
}
