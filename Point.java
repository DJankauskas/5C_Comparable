/**
  Represent a point, using Cartesian coordinates
 */
public class Point implements Comparable {
    private double xcor;
    private double ycor;
    
    /**
      @return  a negative integer, zero, or a positive integer
      depending on whether this Point is closer, 
      equidistant, or farther than the Point referred to
      by the parameter.
     */
    public int compareTo( Object otherObj){
        //assume the Object is another point
        Point other = (Point)otherObj;
        return (int)(radiusSquared() - other.radiusSquared());
    }

    private double radiusSquared() {
        return this.xcor * this.xcor + this.ycor * this.ycor;
    }

    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")"; 
    }

}