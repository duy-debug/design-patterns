package onthigk.singleton.logger;

public class MainDuy {
  public static void main(String[] args) {
    LoggerDuy l = LoggerDuy.getInstance();
    ProgramDuy p = new ProgramDuy("1");
    ProgramDuy p2 = new ProgramDuy("2");
    ProgramDuy p3 = new ProgramDuy("3");
    p.writeLog("Overthink","1/1/2025");
    p2.writeLog("Overload","1/10/2025");
    l.viewLog();
  }
}
