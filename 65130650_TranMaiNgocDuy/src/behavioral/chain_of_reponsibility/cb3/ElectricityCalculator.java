package behavioral.chain_of_reponsibility.cb3;

public abstract class ElectricityCalculator {
  protected ElectricityCalculator nextCalculator;
  public ElectricityCalculator setNextCalculator(ElectricityCalculator nextCalculator) {
    this.nextCalculator = nextCalculator;
    return this;
  }
  public abstract double calculatorBill(int kwh);
}
