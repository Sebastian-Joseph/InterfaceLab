public interface Lockable {
     public void setKey(int key);
     public void lock(int lock);
     public void unlock(int unlock);
     public Boolean isLocked();
}
