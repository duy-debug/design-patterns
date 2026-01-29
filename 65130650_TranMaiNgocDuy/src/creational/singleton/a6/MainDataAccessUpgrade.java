package creational.singleton.a6;

public class MainDataAccessUpgrade {
  public static void main(String[] args) {
    DataAccessUpgrade ui1 = DataAccessUpgrade.getInstance("Danh");
    DataAccessUpgrade ui2 = DataAccessUpgrade.getInstance("Duy");
    DataAccessUpgrade ui3 = DataAccessUpgrade.getInstance("Danh");
    ui1.add(new SanPham("1","Dừa",5,5000));
    ui2.add(new SanPham("2","Bánh",4,45000));
    ui3.add(new SanPham("3","Nước",6,89000));
    ui1.inDanhSach();
    ui2.inDanhSach();
  }
}
