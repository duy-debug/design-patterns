package structural.bridge;

public class MainRemote {
  public static void main(String[] args) {
    AdvancedRemote advancedRemote = new AdvancedRemote(new TV());
    advancedRemote.togglePower();
    for (int i = 1; i <= 10; i++) {
      advancedRemote.volumeUp();
    }
    advancedRemote.mute();
    advancedRemote.mute();
  }
}
