package structural.bridge;

public class TV implements Device{
  boolean state = false;
  int volume = 0;
  @Override
  public boolean isEnabled() {
    return state;
  }

  @Override
  public void enable() {
    state = true;
    System.out.println("TV is enabled");
  }

  @Override
  public void disable() {
    state = false;
    System.out.println("TV is disabled");
  }

  @Override
  public int getVolume() {
    return volume;
  }

  @Override
  public void setVolume(int percent) {
    volume = percent;
  }
}

