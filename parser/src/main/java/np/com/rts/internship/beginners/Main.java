package np.com.rts.internship.beginners;

import java.util.*;


public class Main {

  private String parseThis = "3127162:261111\n" +
          "TUY-7.4/1\n" +
          "DPOG5";

  // Parsed value must be inserted into this variable
  double value;

  public Main() {
    // Write your code here
      ArrayList<Integer> arr=new ArrayList<Integer>();
      ArrayList<String> str=new ArrayList<String>();

      //System.out.println(parseThis);
    String ola[]=parseThis.split("\n");
      String second=ola[1];

      char[] ascii1 = second.toCharArray();
      for(char ch:ascii1){
          arr.add((int)ch);
      }
      for(int i:arr){
          str.add(Character.toString ((char) (i-1)));
      }
      String yo=str.get(6)+str.get(7)+str.get(8);
      double val = Double.parseDouble(yo);
      value=val;
  }

  public static void main(String[] args) {
    new Main();
  }
}
