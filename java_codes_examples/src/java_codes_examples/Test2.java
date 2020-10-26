package java_codes_examples;

public class Test2 
{ 
    public Test2() 
    {
    	System.out.printf("1");
    	new Test2(10); 
        System.out.printf("5"); 
    } 
    public Test2(int temp) 
    { 
        System.out.printf("2"); 
        new Test2(10, 20); 
        System.out.printf("4"); 
    } 
    public Test2(int data, int temp) 
    { 
        System.out.printf("3"); 
          
    } 
      
    public static void main(String[] args) 
    { 
        Test2 obj = new Test2(); 
          
    } 
      
}