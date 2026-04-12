package behavioral.mediator.chat;

public class ChatSimpleUser extends ChatUser {

  public ChatSimpleUser(String id, String name, IChatMediator mediator) {
    super(id, name, mediator);
  }

  @Override
  public void receive(String message, ChatUser from) {
    System.out.println("[" + this.name + " nhận từ " + from.name + "]: " + message);
  }
}
