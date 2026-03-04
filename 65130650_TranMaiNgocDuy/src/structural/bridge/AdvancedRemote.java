package structural.bridge;

public class AdvancedRemote extends Remote {
  int currentVolume;
  public AdvancedRemote(Device device) {
    super(device);
  }
  public void mute(){
    if(device.isEnabled()){
      if(device.getVolume() == 0){
        device.setVolume(currentVolume);
        System.out.println(currentVolume);
      }
      else{
        currentVolume = device.getVolume();
        device.setVolume(0);
        System.out.println(device.getVolume());
      }
    }
  }
  @Override
  public void volumeDown(){
    super.volumeDown();
    currentVolume = this.device.getVolume();
  }
  @Override
  public void volumeUp(){
    super.volumeUp();
    currentVolume = currentVolume =this.device.getVolume();
  }
}
