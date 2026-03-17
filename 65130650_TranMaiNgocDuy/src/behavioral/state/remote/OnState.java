package behavioral.state.remote;

public class OnState implements IRemoteState{
  @Override
  public void handle(RemoteControl remote) {
    System.out.println("TV is off");
    remote.setState(new OffState());
  }
}
