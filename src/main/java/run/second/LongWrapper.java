package run.second;


public class LongWrapper {

    private Object key = new Object();
    private long l;

    public long getL() {
        return l;
    }

    public void setL(long l) {
        this.l = l;
    }

    public void incrementValue() {
        synchronized (key) {

            l = l + 1;
        }
    }

    public LongWrapper(long l) {

        this.l = l;
    }

}
