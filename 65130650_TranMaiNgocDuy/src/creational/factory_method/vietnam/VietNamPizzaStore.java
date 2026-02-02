package creational.factory_method.vietnam;

import creational.factory_method.Pizza;
import creational.factory_method.PizzaStore;
import creational.factory_method.PizzaType;

public class VietNamPizzaStore extends PizzaStore {
  @Override
  public Pizza createPizza(PizzaType type) {
    switch(type){
      case HAISAN:
        return new PizzaHaiSan();
//      case BO:
//        return new PizzaBo();
//      case PHOMAI:
//        return new PizzaPhoMai();
      default:
        return null;
    }
  }
}
