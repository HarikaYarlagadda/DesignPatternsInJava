
public class FruitFactory {
	
   //use getShape method to get object of type shape 
   public static Fruits getFruit(String fruitType){
      if(fruitType == null){
         return null;
      }		
      if(fruitType.equalsIgnoreCase("apple")){
         return new Apple();
         
      } else if(fruitType.equalsIgnoreCase("Banana")){
         return new Banana();
         
      } else if(fruitType.equalsIgnoreCase("WaterMelon")){
         return new WaterMelon();
      }
      
      return null;
   }
}
