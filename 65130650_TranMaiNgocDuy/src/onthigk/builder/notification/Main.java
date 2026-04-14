package onthigk.builder.notification;

public class Main {
  public static void main(String[] args) {
    Notification n = new Notification.BuilderDuy()
            .buildTieuDe("Trang chủ")
            .buildNoiDung("Bán hàng")
            .buildBieuTuong("Vip pro")
            .buildAmThanh("Qick")
            .buildDoUuTien("1")
            .buildNutHanhDong("Click")
            .build();
    System.out.println(n.toString());
  }
}
