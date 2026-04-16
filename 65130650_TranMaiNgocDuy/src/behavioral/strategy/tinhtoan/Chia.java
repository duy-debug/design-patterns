package behavioral.strategy.tinhtoan;

public class Chia implements ITinh {
  @Override
  public double tinh(double a, double b) {
    System.out.println(a + "/" + b + "=");
    if(b == 0){
      System.out.println("Không thể chia cho 0");
    }
    return a / b;
  }
}
