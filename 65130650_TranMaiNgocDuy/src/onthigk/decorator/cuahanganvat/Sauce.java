package onthigk.decorator.cuahanganvat;

public class Sauce extends ProductDecorator{
  public Sauce(IProduct product) {
    super(product);
  }
  @Override
  public double getCost() {
    return product.getCost() + 1.5;
  }

  @Override
  public String getDescription() {
    return "đã thêm sốt chua cay! +1.500 vnd";
  }
}
