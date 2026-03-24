package behavioral.observer.ca6;

public class PlayerData {
  IPlayerListener listener;
  String thoiGian;
  int countDown;
  float grade;

  public PlayerData(String thoiGian, int countDown, float grade) {
    this.thoiGian = thoiGian;
    this.countDown = countDown;
    this.grade = grade;
  }

  public PlayerData() {

  }

  public void setThoiGian(String thoiGian) {
    this.thoiGian = thoiGian;
  }

  public void setCountDown(int countDown) {
    this.countDown = countDown;
  }

  public void setGrade(float grade) {
    this.grade = grade;
  }
  public void attach(IPlayerListener playerListeners) {
    this.listener = playerListeners;
  }
  public void click(){
    if(listener!=null){
      listener.listen(this);
    }
  }
  @Override
  public String toString() {
    return "PlayerData{" +
            "thoiGian='" + thoiGian + '\'' +
            ", countDown=" + countDown +
            ", grade=" + grade +
            '}';
  }
}
