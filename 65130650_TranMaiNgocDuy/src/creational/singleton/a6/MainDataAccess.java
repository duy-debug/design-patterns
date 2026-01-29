package creational.singleton.a6;

public class MainDataAccess {
  public static void main(String[] args) {
    SanPham s1 = new SanPham("1","Nước",1,6000);
    SanPham s2 = new SanPham("2","Bánh",2,76000);
    SanPham s3 = new SanPham("3","Dừa",3,86100);
    DataAccess u1 = DataAccess.getInstance();
    DataAccess u2 = DataAccess.getInstance();
    DataAccess u3 = DataAccess.getInstance();
    u1.add(s1);
    u2.add(s2);
    u3.add(s3);
    u1.inDanhSach();
  }
}
