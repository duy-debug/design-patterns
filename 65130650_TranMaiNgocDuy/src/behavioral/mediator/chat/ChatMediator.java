package behavioral.mediator.chat;

import java.util.HashMap;
import java.util.Map;

public class ChatMediator implements IChatMediator {
  private Map<String, ChatUser> userMaps = new HashMap<>();

  @Override
  public void register(ChatUser user) {
    userMaps.put(user.id, user);
    System.out.println("System: " + user.name + " đã tham gia phòng chat.");
  }

  @Override
  public void unregister(ChatUser user) {
    userMaps.remove(user.id);
    System.out.println("System: " + user.name + " đã rời phòng chat.");
  }

  @Override
  public void sendMessage(String message, ChatUser from, String told) {
    ChatUser toUser = userMaps.get(told);
    if (toUser != null) {
      toUser.receive("(Private) " + message, from);
    } else {
      System.out.println("System: Không tìm thấy người dùng có ID: " + told);
    }
  }

  @Override
  public void sendBroadcast(String message, ChatUser from) {
    for (ChatUser user : userMaps.values()) {
      if (!user.id.equals(from.id)) {
        user.receive("(Broadcast) " + message, from);
      }
    }
  }
}
