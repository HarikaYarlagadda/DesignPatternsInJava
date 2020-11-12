
public class FactoryPatternDemo {

   public static void main(String[] args) {
      @SuppressWarnings("unused")
	FruitFactory fruitfactory = new FruitFactory();

      Fruits fruit1 = FruitFactory.getFruit("Apple");
      fruit1.fruitname();

      Fruits fruit2 = FruitFactory.getFruit("Banana");
      fruit2.fruitname();
      
      Fruits fruit3 = FruitFactory.getFruit("WaterMelon");
      fruit3.fruitname();
   }
}