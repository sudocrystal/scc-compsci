import java.util.*;
import java.io.*;

public class LetterInventory implements Inventory {
    private int letters;
    private int size;

    public LetterInventory() {
      letters = new int[26];
      size = 0;
    }

    public void add(String s) {
      for(String character : s) {
      if(Character.isLetter(s)) {
        s = s.toLowerCase();
        // increments appropriate index for letter
        letters[s-97]++;
      }
    }

    public void subtract(String s) {
      if(Character.isLetter(s)) {
        s = s.toLowerCase();
        letters[s-97]--;
      }
    }

    public int get(String s) {
      if()
    }

    public void set(String s, int count);
    public boolean contains(String s);
    public boolean isEmpty();
    public int size();

    public String toString() {
      return Arrays.toString(letters);
    }
}
