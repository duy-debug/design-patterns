package behavioral.mediator.chat;

public abstract class ChatUser {
  protected String id;
  protected String name;
  protected IChatMediator mediator;

  public ChatUser(String id, String name, IChatMediator mediator) {
    this.id = id;
    this.name = name;
    this.mediator = mediator;
  }
  public void register() {
    mediator.register(this);
  }
  public void unregister() {
    mediator.unregister(this);
  }
  public void sendMessage(String message, String told) {
    mediator.sendMessage(message, this, told);
  }

  public void sendBroadcast(String message) {
    mediator.sendBroadcast(message, this);
  }
  public abstract void receive(String message, ChatUser from);
}
