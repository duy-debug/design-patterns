package structural.deccorator.b1;

public class MainBieuThuc {
  public static void main(String[] args) {
    BieuThuc b = new BieuThucDonGian(6);
    Cong cong = new Cong(b,9);
    Nhan nhan = new Nhan(cong,8);
    Cong cong2 = new Cong(nhan,5);
    System.out.println(cong2.toString());

    BieuThuc b2 = new BieuThucDonGian(8);
    Cong cong3 = new Cong(b2,6);
    Chia chia = new Chia(cong3,2);
    Nhan nhan2 = new Nhan(chia,5);
    Cong cong4 = new Cong(nhan2,8);
    Tru tru = new Tru(cong4,4);
    System.out.println(tru.toString());

  }
}
