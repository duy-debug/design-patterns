package behavioral.chain_of_reponsibility.cb1;

public class Main {
  public static void main(String[] args) {
    int amount = 293;
    System.out.println("Cau a: Rut tien binh thuong menh gia lon nhat la 500!");
    System.out.println("Toi muon rut 293k");
    // Bắt đầu từ chuỗi 500
    MoneyDispenser defaultChain = ATM_Machine.getDispenser(500);
    defaultChain.dispenser(amount);

    System.out.println("Cau b: Rut tien voi menh gia lon nhat duoc chon!");
    System.out.println("Toi muon rut 293k");
    MoneyDispenser customChain = ATM_Machine.getDispenser(50);
    if(customChain != null){
      customChain.dispenser(amount);
    }
  }
}
