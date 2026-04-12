package behavioral.template_method.cd2;

public class Main {
  public static void main(String[] args) {
    MonHoc mh1 = new MonHoc(123, "MH2", "MH3");
    System.out.println(mh1.toString());
    SinhVien sv1 = new SinhVien(1, "Duy", "30/10/2005", "Khánh Hòa");
    System.out.println(sv1.toString());
  }
}
