package behavioral.strategy.tinhtoan;

public class Context {
  public ITinh tinh;
  public Context(ITinh tinh) {
    this.tinh = tinh;
  }

  public Context() {

  }

  public void setTinhToan(ITinh tinh){
    this.tinh = tinh;
  }
  public double tinh(double a, double b){
    return tinh.tinh(a,b);
  }
}
