
public class SingleObject {

   //create an object of SingleObject
   private static SingleObject single = new SingleObject();

   //make the constructor private so that this class cannot be
   //instantiated
   private SingleObject(){
	   
   }

   //Get the only object available
   public static SingleObject getInstance(){
      return single;
   }

   public void showMessage(){
      System.out.println("Hello,this is an example for singleton design pattern");
   }
}