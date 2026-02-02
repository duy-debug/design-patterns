package creational.factory_method;

import creational.factory_method.vietnam.VietNamPizzaStore;

public class MainPizza {
  public static void main(String[] args) {
    PizzaStore store = new VietNamPizzaStore();
    Pizza pizza = store.orderPizza(PizzaType.HAISAN);
    System.out.println(pizza.toString());
  }
}
