package np.com.rts.internship.beginners;

/**
 * Created by ruraj on 5/19/16.
 */
public class SimpleThing implements Comparable {

  public String nothingSpecial;
  public int    stillNothingSpecial;

  public SimpleThing(String nothingSpecial, int stillNothingSpecial) {
    this.nothingSpecial = nothingSpecial;
    this.stillNothingSpecial = stillNothingSpecial;
  }


  @Override
  public int compareTo(Object o) {
    SimpleThing aso=(SimpleThing )o;
    return this.nothingSpecial.compareTo(aso.nothingSpecial);
  }
}

