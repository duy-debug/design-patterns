package onthigk.decorator.cuahanganvat;

public class Discount extends ProductDecorator {
  private double amount;
  public Discount(IProduct product,double amount) {
    super(product);
    this.amount = amount;
  }

  @Override
  public double getCost() {
    return product.getCost()-(amount* product.getCost())/100;
  }

  @Override
  public String getDescription() {
    return "giảm giá " + amount + "%";
  }
}
