import java.util.Random;

public class Fortunecookie 
{
    public static void main( String[] args )
    {
        Random r = new Random();
        
        int fortune = 1 + r.nextInt(7);
        int lottonum = 1 + r.nextInt(54);
        String response="";
        
        if ( fortune == 1)
            response=" you will be rich";
       
         else if ( fortune == 2)
            response=" you will die";
         else if ( fortune == 3)
            response="you will find favor";
         else if ( fortune == 4)
            response="you will be very sad";
         else if ( fortune == 5)
            response="you will get married soon";
         else if ( fortune == 6)
            response=" you will have children soon";
         else if ( fortune == 7)
            response=" you will travel the world";
         
         
         else response="your fortune cant be told";
        
        System.out.println( " YOUR FORTUNE SAYS" + response);
        
        System.out.print( 1 + r.nextInt(54) + " \t ");
        System.out.print( 1 + r.nextInt(54) + " \t ");
        System.out.print( 1 + r.nextInt(54) + " \t ");
        System.out.print( 1 + r.nextInt(54) + " \t ");
        System.out.print( 1 + r.nextInt(54) + " \t ");
        System.out.print( 1 + r.nextInt(54) + " \t ");
        System.out.println();
        
    }
    
}
