package behavioral.chain_of_reponsibility.ex;

public class Director extends  Approver{
  @Override
  public void processRequest(double amount) {
    if (amount <= 50000000) {
      System.out.println("Director approved: " + amount);
    } else {
      System.out.println("Số tiền quá lớn, không thể duyệt");
    }
  }
}
