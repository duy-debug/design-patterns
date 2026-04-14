package onthigk.decorator.cuahanganvat;

public class Topping extends ProductDecorator{
  public Topping(IProduct product) {
    super(product);
  }
  @Override
  public double getCost() {
    return product.getCost() + 5000; // thêm 5k
  }

  @Override
  public String getDescription() {
    return "thêm topping bánh flan + 5000 vnd";
  }
}
