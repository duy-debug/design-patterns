package onthigk.decorator.cuahanganvat;

public class Main {
  public static void main(String[] args) {
    // Chọn món cơ baản
    IProduct myOrder = new BasicProduct("Trà sữa", 5000,"Vị dâu");
    System.out.println(myOrder.toString());
    // Thêm tùy chọn
    myOrder = new Topping(myOrder);
    System.out.println(myOrder.getDescription());
    myOrder = new SpecialPackaging(myOrder);
    System.out.println(myOrder.getDescription());
    myOrder = new Sauce(myOrder);
    System.out.println(myOrder.getDescription());
    myOrder = new Discount(myOrder,10); // giảm giá 10%
    System.out.println(myOrder.getDescription());
    System.out.println("Tổng tiền " +myOrder.getCost() +" VNĐ");
  }
}
