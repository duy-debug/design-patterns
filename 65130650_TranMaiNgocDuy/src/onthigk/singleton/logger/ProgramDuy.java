package onthigk.singleton.logger;

public class ProgramDuy {
  private String id;

  public ProgramDuy(String id) {
    this.id = id;
  }

  public void writeLog(String noiDung, String thoiGian){
    LoggerDuy l = LoggerDuy.getInstance();
    l.writeLog(new LogItem(noiDung,thoiGian,id));
  }
}
