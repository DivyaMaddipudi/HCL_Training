package java_codes_examples;


public class Example3 
{
    static boolean b;
    public static void main(String [] args) 
    {
        short hand = 42;
        if ( hand < 50 && !b ) /* Line 7 */
            hand++;
        if ( hand > 50 );     /* Line 9 */ //legal statement which does nothing
        else if ( hand > 40 ) 
        {
            hand += 7;
            hand++;    
        }
        else
            --hand;
        System.out.println(hand);
    }
}
