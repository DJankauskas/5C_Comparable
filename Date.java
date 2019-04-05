/**
  Represent a date
 */
public class Date implements Comparable {
    private int y,m,d;
    

    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

    public int compareTo(Object otherObject) {
        Date other = (Date)otherObject;
        if (y != other.y) {
            return y - other.y;
        }
        if (m != other.m) {
            return m - other.m;
        }
        return d - other.d;
    }

}