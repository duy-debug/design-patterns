package onthigk.singleton.logger;

public class LogItem {
  private String noiDung, tg, proId;

  public LogItem(String noiDung, String tg, String proId) {
    this.noiDung = noiDung;
    this.tg = tg;
    this.proId = proId;
  }

  public String getNoiDung() {
    return noiDung;
  }
  public void setNoiDung(String noiDung) {
    this.noiDung = noiDung;
  }
  public String getId() {
    return tg;
  }
  public void setId(String tg) {
    this.tg = tg;
  }
  public String getProId() {
    return proId;
  }
  public void setProId(String proId) {
    this.proId = proId;
  }

  @Override
  public String toString() {
    return "LogItem{" +
            "noiDung='" + noiDung + '\'' +
            ", tg='" + tg + '\'' +
            ", proId='" + proId + '\'' +
            '}';
  }
}
