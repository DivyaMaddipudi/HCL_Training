package java_codes_examples;

public class Test5  
{ 
    private static int data = 10; 
    private static int LocalClass() 
    { 
        class Inner 
        { 
            public int data = 20; 
            private int getData() 
            { 
//            	System.out.println(data);
                return data; 
            } 
        }
        Inner inner = new Inner();
//        System.out.println(inner.getData());
        return inner.getData(); 
    } 
      
    public static void main(String[] args) 
    { 
    	
        System.out.println(data * LocalClass()); 
    } 
}
