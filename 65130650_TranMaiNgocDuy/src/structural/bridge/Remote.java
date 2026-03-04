package structural.bridge;

public class Remote {
  Device device;
  public Remote(Device device){
    this.device = device;
  }
  public void togglePower(){
    if(device.isEnabled())
      device.disable();
    else
      device.enable();
  }
  public void volumeDown(){
    int volume = device.getVolume();
    if(device.isEnabled() && volume > 0){
      device.setVolume(--volume);
      System.out.println(volume);
    }
  }
  public void volumeUp(){
    int volume = device.getVolume();
    if(device.isEnabled() && volume < 100){
      device.setVolume(++volume);
      System.out.println(volume);
    }
  }
}
