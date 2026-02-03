package structural.deccorator.beverage;

public class BeverageMain {
  public static void main(String[] args) {
    Beverage bevegrage = new DarkRoast("Cafe Trung Nguyên");
    System.out.println(bevegrage.getDescription());
    System.out.println(bevegrage.cost());
    bevegrage = new Milk("Sửa cô gái Hà Lan", bevegrage);
    System.out.println(bevegrage.getDescription());
    System.out.println(bevegrage.cost());
    bevegrage = new Milk("Sửa ông thọ", bevegrage);
    System.out.println(bevegrage.getDescription());
    System.out.println(bevegrage.cost());
  }
}
