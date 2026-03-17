package behavioral.state.remote;

public class OffState implements IRemoteState {

  @Override
  public void handle(RemoteControl remote) {
    System.out.println("TV is on");
    remote.setState(new OnState());
  }
}
