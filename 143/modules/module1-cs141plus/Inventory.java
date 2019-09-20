public interface Inventory {
    public void add(String s);
    public void subtract(String s);
    public int get(String s);
    public void set(String s, int count);
    public boolean contains(String s);
    public boolean isEmpty();
    public int size();
}
