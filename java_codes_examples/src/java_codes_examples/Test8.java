package java_codes_examples;

class AB
{
	int i;
	int j;
     AB() 
     {
         i = 1;
         j = 2;
     }
}
class Test8 
{
     public static void main(String args[])
     {
          AB obj1 = new AB();
          AB obj2 = new AB();
          System.out.println(obj1.hashCode());
          System.out.println(obj2.hashCode());
	     System.out.print(obj1.equals(obj2));
	     System.out.print(obj1 == obj2);
     }
}