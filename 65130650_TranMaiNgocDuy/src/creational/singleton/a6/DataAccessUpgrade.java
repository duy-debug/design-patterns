package creational.singleton.a6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataAccessUpgrade {
  private static Map<String,DataAccessUpgrade> instance = new HashMap<>();
  List<SanPham> sps = new ArrayList<>();
  private DataAccessUpgrade(){}
  public static DataAccessUpgrade getInstance(String tag){
    if(instance.get(tag) == null){
      instance.put(tag, new DataAccessUpgrade());
    }
    return instance.get(tag);
  }
  public void add(SanPham s){
    sps.add(s);
  }
  public void inDanhSach(){
    for(var s: sps){
      System.out.println(s.toString());
    }
  }
}
