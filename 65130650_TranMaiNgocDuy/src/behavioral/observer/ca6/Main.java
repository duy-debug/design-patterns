package behavioral.observer.ca6;

public class Main {
  public static void main(String[] args) {
    PlayerData playerData = new PlayerData("4",5,6);
    Dashboard dashboard = new Dashboard(playerData);
    dashboard.listen(playerData);
    playerData.setThoiGian("10");
    playerData.setCountDown(10);
    playerData.setGrade(10);
    dashboard.listen(playerData);
  }
}
