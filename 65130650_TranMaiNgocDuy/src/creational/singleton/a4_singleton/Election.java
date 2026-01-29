package creational.singleton.a4_singleton;

import java.util.ArrayList;
import java.util.List;

public class Election {
  private static Election instance;
  private int trump = 0, biden = 0;
  List<String> voteUsers = new ArrayList<>();
  private Election() {} // Constructor
  public static Election getInstance(){
    if(instance == null){
      instance = new Election();
    }
    return instance;
  }
  protected void vote(Candidate c, String userId){
    for(var id: voteUsers){
      if(id.equals(userId)){
        return;
      }
    }
    voteUsers.add(userId);
    if(c == Candidate.DONAL_TRUMP){
      trump++;
    }
    else{
      biden++;
    }
  }
  public void printResult(){
    System.out.println("Donal Trump: " + trump);
    System.out.println("Joe Biden: " +biden);
  }
}
