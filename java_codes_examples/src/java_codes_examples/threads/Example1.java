package java_codes_examples.threads;

public class Example1 {
	 public static void main(String args[])
	    {
	        Thread t = Thread.currentThread();
	        
//	        t.setName("New Thread");
//	        System.out.println(t.getName());  
	        System.out.println(t);
	        
	        System.out.println(t.getPriority());
	    }
}


