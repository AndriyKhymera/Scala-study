public class CharEntry {

    private char c;
    private int count;

    public CharEntry(char c) {
        this.c = c;
        this.count = 0;
    }

    public CharEntry(char c, int count) {
        this.c = c;
        this.count = count;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "CharEntry{" +
                "c=" + c +
                ", count=" + count +
                '}';
    }
}
