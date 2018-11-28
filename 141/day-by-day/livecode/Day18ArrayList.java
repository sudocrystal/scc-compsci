import java.util.ArrayList;
import java.util.Random;

public class Day18ArrayList {
	public static void main(String[] args) {
      learnArrayList();

//       Random r = new Random();
//       ArrayList<Integer> values = createList(r,5,200);
//       System.out.println("initial values = " + values);
//
//       duplicateList(values);
//       //maxToEnd(values);
//       //removeOdd(values);
//
//       System.out.println("values = " + values);

    // ArrayList<String> words = createWordList();
    // System.out.println("words contains " + words);
    //
    // int len = maxLength(words);
    // System.out.println("highest # of chars = " + len);

    // removeStartWith(words,'c');
    // System.out.println("words contains " + words);
	}

   public static void learnArrayList() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
      nums.add(1);
      nums.add(29);
      nums.add(54);
      nums.add(2);

      System.out.println("nums contains = " + nums);
		System.out.println("# of elements = " + nums.size());
   }

   // this method should create a list of 'numElements' number of ints
   // where each int is a random number between 1 and 'high'
   // e.g. createList(3,15) might return [13, 1, 9]
   public static ArrayList<Integer> createList(Random r, int numElements, int high) {
      return null;
   }

	// duplicates a list of Integers by appending each element in the list
   // to the end of the list
	// e.g. [1,2,3] ==> [1,2,3,1,2,3]
	public static void duplicateList(ArrayList<Integer> list) {
	}

	// this method moves the max value in a list of Integers to the end
	// e.g. [1,29,54,2] ==> [1,29,2,54]
	public static void maxToEnd(ArrayList<Integer> list) {
	}

   // remove all odd value elements (not odd indexed) in list
   public static void removeOdd(ArrayList<Integer> list) {
   }

   // this method returns a list of Strings
   public static ArrayList<String> createWordList() {
      return null;
   }

	// this method returns the length of the longest String
	// e.g. ["hi", "hello", "hola", "yo"] ==> 5
	public static int maxLength(ArrayList<String> list) {
      return 0;
   }

   // remove all elements in list that begin with specified char
   public static void removeStartWith(ArrayList<String> list, char c) {
   }
}

// Helpful translation from array to ArrayList:
//    String[]          => ArrayList<String>
//    new String[10]    => new ArrayList<String>()
//    a.length          => list.size()
//    a[i]              => list.get(i)
//    a[i] = value;     => list.set(i, value);
//
// new operations:
//     list.remove(i);     --remove the ith value
//     list.add(value);    --appends a value
//     list.add(i, value); --adds at an index
//     list.clear()        --remove all value
//     list.contains(x)    --returns T/F if x is in the list
