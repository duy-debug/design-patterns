package creational.singleton.a4_singleton;

public class MainVote {
  public static void main(String[] args) {
    User u1 = new User("Chí Danh");
    User u2 = new User("Kim Chi");
    User u3 = new User("Phi Hào");
    u1.vote(Candidate.DONAL_TRUMP);
    u2.vote(Candidate.JOE_BIDEN);
    u3.vote(Candidate.JOE_BIDEN);
    Election.getInstance().printResult();
    u1.vote(Candidate.DONAL_TRUMP);
    u2.vote(Candidate.JOE_BIDEN);
    u3.vote(Candidate.JOE_BIDEN);
    Election.getInstance().printResult();
  }
}
