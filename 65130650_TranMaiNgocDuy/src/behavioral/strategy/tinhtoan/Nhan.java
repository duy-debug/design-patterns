package behavioral.strategy.tinhtoan;

public class Nhan implements ITinh {
  @Override
  public double tinh(double a, double b) {
    System.out.println(a + "*" + b + "=");
    return a*b;
  }
}
