package behavioral.chain_of_reponsibility.ex;

public class TeamLead extends Approver {
  @Override
  public void processRequest(double amount) {
    if (amount <= 10000000) {
      System.out.println("Team Lead approved: " + amount);
    } else if (nextApprover != null) {
      System.out.println("Team Lead chuyển lên Manager");
      nextApprover.processRequest(amount);
    }
  }
}
