package behavioral.strategy.duck_65cntt;

public class VitGioi extends Duck65 {
  @Override
  public void display() {
    System.out.println("Em là vịt giời đang yêu");
    performFly();
    performQuack();
    swim();
    System.out.println("Ngày mai em lấy chồng!!!");
  }
}
