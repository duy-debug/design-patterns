package onthigk.decorator.cuahanganvat;

public class SpecialPackaging extends ProductDecorator{

  public SpecialPackaging(IProduct product) {
    super(product);
  }
  @Override
  public double getCost() {
    return product.getCost()+2000; // thêm 2k
  }

  @Override
  public String getDescription() {
    return "đóng gói đặc biệt +2000 vnd";
  }
}
