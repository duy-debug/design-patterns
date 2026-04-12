package behavioral.chain_of_reponsibility.cb3;

public class Main {
  public static void main(String[] args) {
    ElectricityCalculator bac1 = new TierCalculator("Bậc 1 (0-50 kwh)", 50, 1806);
    ElectricityCalculator bac2 = new TierCalculator("Bậc 2 (51-100 kwh)", 50, 1866);
    ElectricityCalculator bac3 = new TierCalculator("Bậc 3 (101-200 kwh)", 100, 2167);
    ElectricityCalculator bac4 = new TierCalculator("Bậc 4 (201-300 kwh)", 100, 2729);
    ElectricityCalculator bac5 = new TierCalculator("Bậc 5 (301-400 kwh)", 100, 3050);
    ElectricityCalculator bac6 = new TierCalculator("Bậc 6 (>400 kwh)", 100, 3151);

    bac1.setNextCalculator(bac2)
            .setNextCalculator(bac3)
            .setNextCalculator(bac4)
            .setNextCalculator(bac5)
            .setNextCalculator(bac6);
    System.out.println(bac1.toString());
    System.out.println(bac2.toString());
    System.out.println(bac3.toString());
    System.out.println(bac4.toString());
    System.out.println(bac5.toString());
    System.out.println(bac6.toString());
    testCalculateBill(bac1,45);
    testCalculateBill(bac1,125);
    testCalculateBill(bac1,555);

  }
  private static void testCalculateBill(ElectricityCalculator chain, int kwh){
    System.out.println("Hoa don cho gia dinh dung " + kwh + " kwh");
    double totalBill = chain.calculatorBill(kwh);
    System.out.println("Tong tien " + totalBill + " vnd");
  }
}
