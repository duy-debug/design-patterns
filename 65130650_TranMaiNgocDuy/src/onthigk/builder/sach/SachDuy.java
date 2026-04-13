package onthigk.builder.sach;

import java.util.ArrayList;

public class SachDuy {
  private String tuaDe;
  private int soTrang;
  private String tacGia;
  private ArrayList<String> dsChuong;
  private SachDuy(BuilderDuy builder){
    this.tuaDe = builder.tuaDe;
    this.soTrang = builder.soTrang;
    this.tacGia = builder.tacGia;
    this.dsChuong = builder.dsChuong;
  }

  public void in(){
    System.out.println(this.tuaDe);
    System.out.println(this.soTrang);
    System.out.println(this.tacGia);
    for(String chuong : dsChuong){
      System.out.println(chuong.toString());
    }
  }
  public static class BuilderDuy {
    private String tuaDe;
    private int soTrang;
    private String tacGia;
    private ArrayList<String> dsChuong = new ArrayList<>();

    public BuilderDuy setTuaDe(String tuaDe) {
      this.tuaDe = tuaDe;
      return this;
    }

    public BuilderDuy setSoTrang(int soTrang) {
      this.soTrang = soTrang;
      return this;
    }

    public BuilderDuy setTacGia(String tacGia) {
      this.tacGia = tacGia;
      return this;
    }

    public BuilderDuy addChuong(String Chuong) {
      this.dsChuong.add(Chuong);
      return this;
    }
    public SachDuy build(){
      return new SachDuy(this);
    }
  }
}
