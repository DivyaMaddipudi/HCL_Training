package java_codes_examples;

public class example2 
{
    static boolean b1, b2; // intially false
    public static void main(String [] args) 
    {
        int x = 0;
        System.out.println(b1);
        if ( !b1 ) /* Line 7 */
        {
            if ( !b2 ) /* Line 9 */
            {
                b1 = true;
                x++;
                if ( 5 > 6 ) 
                {
                    x++;
                }
                if ( !b1 ) 
                    x = x + 10;
                
                else if ( b2 = true ) /* Line 19 */{
                	// setting b2 to true value, since this else if executed subsequent else if avoided
                	x = x + 100;
                } else if ( b1 | b2 ) /* Line 21 */
                    x = x + 1000;
            }
        }
        System.out.println(x);
    }
}