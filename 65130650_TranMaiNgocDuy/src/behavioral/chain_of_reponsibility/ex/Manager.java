package behavioral.chain_of_reponsibility.ex;

public class Manager extends Approver {
  @Override
  public void processRequest(double amount) {
    if (amount <= 30000000) {
      System.out.println("Manager approved: " + amount);
    } else if (nextApprover != null) {
      System.out.println("Manager chuyển lên Director");
      nextApprover.processRequest(amount);
    }
  }
}
