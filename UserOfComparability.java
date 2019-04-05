/**
 * exercise Comparable types
 */

public class UserOfComparability {

  public static void main(String[] commandLine) {
    System.out.println(System.lineSeparator() + "POINT COMPARISONS");

    // Point vs. itself
    Point p0 = new Point(3., 4.);
    reportRelationship("Point vs. itself", p0, p0, "0");

    // different, but with same value
    reportRelationship("different, but with same value", p0, new Point(3., 4.), "0");

    // equidistant
    reportRelationship("equidistant"
    // reflection about y = x
        , p0, new Point(4., 3.), "0");

    // Point vs. point closer to origin
    reportRelationship("Point vs. point closer to origin", p0, new Point(1., 2.), "positive int");

    // Point vs. distant point
    reportRelationship("Point vs. distant point", p0, new Point(100., 2.), "negative int");
    System.out.println("---- end of Point comparisons ----");

    System.out.println(System.lineSeparator() + "DATE COMPARISONS");

    Date epochDate = new Date(1970, 1, 1);
    Date revolutionDate = new Date(1776, 7, 4);

    reportRelationship("Unix epoch vs Declaration of Independence", epochDate, revolutionDate, "positive int");
    reportRelationship("Declaration of independence vs Unix epoch", revolutionDate, epochDate, "negative int");
    reportRelationship("Date compared against itself", epochDate, epochDate, "0");

    reportRelationship("Date vs one day more", epochDate, new Date(1970, 7, 5), "negative int");
    reportRelationship("Date vs one month more", epochDate, new Date(1970, 8, 4), "negative int");

    System.out.println("---- end of Date comparisons ----");

    System.out.println(System.lineSeparator() + "BROKEN COMPARISONS");

    //error: incompatible types: IncomparableDog cannot be converted to Comparable
    //reportRelationship("Two dogs", new IncomparableDog(), new IncomparableDog(), "compile time error");

    //Exception in thread "main" java.lang.ClassCastException: class Date cannot be cast to class Point (Date and Point are in unnamed module of loader 'app')
    //reportRelationship("Point and Date", p0, epochDate, "runtime error");

    System.out.println("---- end of broken comparisons ----");
  }

  /**
   * Print the results of comparing two entities.
   */
  private static void reportRelationship(String description, Comparable a, Comparable b, String expect) {
    System.out.println(description);

    // check
    System.out.println(a + " compareTo " + b + ": " + a.compareTo(b)
    /*
     * eventually expecting a compiler warning: warning: [unchecked] unchecked call
     * to compareTo(T) as a member of the raw type Comparable where T is a
     * type-variable: T extends Object declared in interface Comparable
     */

        + " ...expecting " + expect + System.lineSeparator());
  }
}