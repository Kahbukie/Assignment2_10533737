import java.util.Random;


public class Oneshot 
{
    public static void main( String[] args )
    {
        Random r = new Random();
        int choice = 1 + r.nextInt(100);
        int mynum= 1 + r.nextInt(100);
           String response="";
        
      
        if ( choice < mynum)
        response=" sorry you are too low. I was thinking of " + mynum;
        else if ( choice > mynum)
            response=" sorry you are too high i was thinking of " + mynum;
        else if ( choice == mynum )
            response=" You guessed it! What are the odds?!? ";
        else response="You dont get any more guesses";
        
        
        System.out.println(" I'm thinking of a number between 1-100. Try to guess it." + choice);
        System.out.print(response);
        
        
       
        
       
        
     
        
        
        
   
      
                
                
        
    
    }
    
}
