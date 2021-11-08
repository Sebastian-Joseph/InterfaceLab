public abstract class Keys implements Lockable {
    private String question;
    public static String answer;
    private String key;

    public Keys(String rquestion) {
        question = rquestion;


    }


    public void setKey(String key) {
        key = "5";
    }

    public void lock(int lock) {
        lock = -1;
    }


    public int unlock(int unlock) {
        unlock = 1;
        return unlock;
    }


    public Boolean isLocked() {
        return Boolean.FALSE;

    }

    public String getKey() {

        return key;

    }

    public String getQuestion() {
        return question;
    }
}
