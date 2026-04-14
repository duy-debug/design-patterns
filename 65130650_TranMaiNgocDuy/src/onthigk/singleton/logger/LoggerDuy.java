package onthigk.singleton.logger;

import java.util.ArrayList;

public class LoggerDuy {
  private static LoggerDuy instance;
  ArrayList<LogItem> ds = new ArrayList<>();
  private LoggerDuy() {}
  public static LoggerDuy getInstance() {
    if (instance == null) {
      instance = new LoggerDuy();
    }
    return instance;
  }
  public void writeLog(LogItem log){
    ds.add(log);
  }
  public void viewLog(){
    for(var s: ds){
      System.out.println(s.toString());
    }
  }
}
