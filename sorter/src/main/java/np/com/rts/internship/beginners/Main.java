package np.com.rts.internship.beginners;

import java.util.*;


public class Main {

  String[] strings = new String[] {
          "hello",
          "mello",
          "mell",
          "1mell",
          "hmmm",
          "h2mmm",
          "zxcvb",
          "asdf",
          "%$compli"
  };

  public Main() {
    // Write your code here
    Arrays.sort(strings);
      for(int i = 0; i < strings.length; i++) {
          System.out.println(strings[i]);

      }
      System.out.print("The last element is     : "  );
    System.out.println(strings[strings.length-1]);
  }

  public static void main(String[] args) {

      new Main();
  }
}
