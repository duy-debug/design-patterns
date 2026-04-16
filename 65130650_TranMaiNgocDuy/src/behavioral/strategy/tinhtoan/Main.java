package behavioral.strategy.tinhtoan;

public class Main {
  public static void main(String[] args) {
    Context calculate = new Context();
    calculate.setTinhToan(new Cong());
    System.out.println(calculate.tinh(2, 4));
    calculate.setTinhToan(new Tru());
    System.out.println(calculate.tinh(3, 6));
    calculate.setTinhToan(new Nhan());
    System.out.println(calculate.tinh(4, 8));
    calculate.setTinhToan(new Chia());
    System.out.println(calculate.tinh(5, 0));
  }
}
