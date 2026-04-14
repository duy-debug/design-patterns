package onthigk.decorator.cuahanganvat;

public abstract class ProductDecorator implements IProduct{
  protected IProduct product;
  public ProductDecorator(IProduct product) {
    this.product = product;
  }
}
