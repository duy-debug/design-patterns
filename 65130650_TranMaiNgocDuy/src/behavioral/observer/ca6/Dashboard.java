package behavioral.observer.ca6;

public class Dashboard implements IPlayerListener {
  PlayerData a;
  public Dashboard(PlayerData playerData) {
    this.a = playerData;
    this.a.attach(this);
  }
  @Override
  public void listen(PlayerData playerData) {
    System.out.println(playerData.toString());
  }
}
