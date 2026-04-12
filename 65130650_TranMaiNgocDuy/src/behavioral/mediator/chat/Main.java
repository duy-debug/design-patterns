package behavioral.mediator.chat;

public class Main {
  public static void main(String[] args) {
    IChatMediator chatRoom = new ChatMediator();

    ChatUser user1 = new ChatSimpleUser("1", "Duy", chatRoom);
    ChatUser user2 = new ChatSimpleUser("2", "Đạt", chatRoom);
    ChatUser user3 = new ChatSimpleUser("3", "Chi", chatRoom);
    user1.register();
    user2.register();
    user3.register();
    System.out.println("Bắt đầu chat ");
    user1.sendBroadcast("Chào tất cả mọi người!");
    user2.sendMessage("Chào Duy, mình là Đạt.", "1");
    user3.unregister();
    user1.sendBroadcast("Chi đi đâu rồi?");
  }
}
