package java_codes_examples;



interface Anonymous 
{ 
    public int getValue();

} 
public class Test6  
{ 
    private int data = 15; 
    public static void main(String[] args) 
    { 
        Anonymous inner = new Anonymous() 
                { 
                    int data = 5; 
                    public int getValue() 
                    { 
                        return data; 
                    } 
                    public int getData() 
                    { 
                        return data; 
                    } 
                }; 
        Test6 outer = new Test6(); 
//        System.out.println(inner.getValue() + inner.getData() + outer.data); //error, since inner.getData was not a method of interface
    } 
}