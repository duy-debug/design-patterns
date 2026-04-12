package behavioral.chain_of_reponsibility.cb1;

public abstract class MoneyDispenser {
  protected MoneyDispenser nextDispenser;
  public void setNextDispenser(MoneyDispenser nextDispenser) {
    this.nextDispenser = nextDispenser;
  }
  public abstract void dispenser(int amount);
}
