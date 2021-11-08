public interface Lockable {
     public void setKey(int key);
     public void lock(int lock);
     public int unlock(int unlock);
     public Boolean isLocked();
}
