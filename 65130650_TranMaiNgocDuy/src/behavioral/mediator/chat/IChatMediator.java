package behavioral.mediator.chat;

public interface IChatMediator {
  void register(ChatUser user);
  void unregister(ChatUser user);
  void sendMessage(String message, ChatUser from, String told);
  void sendBroadcast(String message, ChatUser from);
}
