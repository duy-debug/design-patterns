package behavioral.chain_of_reponsibility.ex;

public class Main {
  public static void main(String[] args) {
    Approver teamLead = new TeamLead();
    Approver manager = new Manager();
    Approver director = new Director();

    // Thiết lập chuỗi
    teamLead.setNextApprover(manager);
    manager.setNextApprover(director);

    // Test
    teamLead.processRequest(5000000);   // TL duyệt
    teamLead.processRequest(20000000);  // Manager duyệt
    teamLead.processRequest(40000000);  // Director duyệt
    teamLead.processRequest(60000000);  // Không duyệt
  }
}
