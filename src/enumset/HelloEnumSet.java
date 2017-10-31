import java.util.EnumSet;
import java.util.Set;

enum Months {
    JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
}

public class HelloEnumSet {
    public static void main(String... args) {
        System.out.println("Hello EnumSet!");

        Set<Months> empty = EnumSet.noneOf(Months.class);

        Set<Months> yr = EnumSet.allOf(Months.class);

        EnumSet<Months> h1 = EnumSet.range(Months.JAN, Months.JUN);

        Set<Months> h2 = EnumSet.complementOf(h1);

        Set<Months> q1 = EnumSet.of(Months.JAN, Months.FEB, Months.MAR);
        Set<Months> q2 = EnumSet.of(Months.APR, Months.MAY, Months.JUN);
        Set<Months> q3 = EnumSet.of(Months.JUL, Months.AUG, Months.SEP);
        Set<Months> q4 = EnumSet.of(Months.OCT, Months.NOV, Months.DEC);

        boolean containsFeb = h2.contains(Months.FEB);

        Set<Months> yr02 = EnumSet.copyOf(yr);
        yr02.remove(Months.FEB);

        Set<Months> customYr = EnumSet.noneOf(Months.class);
        customYr.add(Months.MAY);
        customYr.add(Months.JUN);
        customYr.add(Months.JUL);

        System.out.println("Empty: " + empty);
        System.out.println("Year: " + yr);
        System.out.println("First Half of Year: " + h1);
        System.out.println("Second Half of Year: " + h2);
        System.out.printf("Second Half contains FEB = %b\n", containsFeb);
        System.out.println("Year without FEB: " + yr02);
        System.out.println("Custom Year: " + customYr);

        System.out.println("Q1: " + q1);
        System.out.println("Q2: " + q2);
        System.out.println("Q3: " + q3);
        System.out.println("Q4: " + q4);

        int yrSize = yr.size();
        int h1Size = h1.size();
        int q1Size = q1.size();
        int yr2Size = yr02.size();

        System.out.printf("Sizes: yr = %s, h1 = %s, Q1 = %s, Year without FEB = %s\n", yrSize, h1Size, q1Size, yr2Size);
    }
}
