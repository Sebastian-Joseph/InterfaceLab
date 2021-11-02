public class Keys implements Lockable {
    private String question;
    private int answer;
    private int key;

    public Keys(String rquestion) {
        question = rquestion;


    }


    public void setKey(int key) {
        key = 5;
    }

    public void lock(int lock) {
        lock = -1;
    }


    public void unlock(int unlock) {
        unlock = 1;
    }


    public Boolean isLocked() {
        return answer == key;

    }

    public int getKey() {
        return key;
    }

    public String getQuestion() {
        return question;
    }
}
