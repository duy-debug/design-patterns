package onthigk.decorator.cuahanganvat;

public class BasicProduct implements IProduct{
  private String name;
  private double cost;
  private String description;

  public BasicProduct(String name, double cost, String description) {
    this.name = name;
    this.cost = cost;
    this.description = description;
  }

  @Override
  public String toString() {
    return "BasicProduct{" +
            "name='" + name + '\'' +
            ", cost=" + cost +
            ", description='" + description + '\'' +
            '}';
  }

  @Override
  public double getCost() {
    return cost;
  }

  @Override
  public String getDescription() {
    return name;
  }
}
