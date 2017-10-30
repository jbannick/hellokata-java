import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloControlFlow {
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String... args) {
        System.out.println("Hello Control Flow!\n");

        boolean bo;
        byte x;
        short y;
        int z;
        Integer ii;
        char cc;
        String s;

        System.out.println("If-then-else:\n");

        bo = true;
        if (bo) {
            System.out.println("bo is true");
        }

        x = 1;
        if (1 == x) {
            System.out.println("x is 1");
        }

        y = 1;
        if (2 == y) {
            System.out.println("y is 2");
        } else {
            System.out.println("y is not 2");
        }

        z = 1;
        if (2 == z) {
            System.out.println("z is 2");
        } else if (3 == z) {
            System.out.println("z is 3");
        } else {
            System.out.println("z is neither 2 nor 3");
        }

        System.out.println("\nSwitch:\n");

        x = 1;
        switch (x) {
        case 1:
            System.out.println("x is 1");
            break;
        case 2:
            System.out.println("x is 2");
            break;
        default:
            System.out.println("x is neither 1 nor 2");
        }

        cc = 'a';
        switch (cc) {
        case 'a':
        case 'b':
            System.out.println("cc is either a or b");
            break;
        default:
            System.out.println("cc is neither a nor b");
        }

        s = "ham";
        switch (s) {
        case "ham":
            System.out.println("s is ham");
            break;
        case "eggs":
            System.out.println("s is eggs");
            break;
        default:
            System.out.println("s is neither ham nor eggs");
        }

        ii = new Integer(1);
        switch (ii) {
        case 1:
            System.out.println("ii is 1");
            break;
        case 2:
            System.out.println("ii is 2");
            break;
        default:
            System.out.println("ii is neither 1 nor 2");
        }

        Day day = Day.MONDAY;
        switch (day) {
        case MONDAY:
            System.out.println("Day is Monday");
            break;
        default:
            System.out.println("Got UNKNOWN day");
        }

        System.out.println("\nWhile:\n");

        x = 0;
        while (x <= 3) {
            System.out.println(String.format("x is %s", x));
            x++;
        }
        System.out.println("---");

        x = 4;
        while (x <= 3) {
            System.out.println(String.format("x is %s", x));
            x++;
        }
        System.out.println("---");

        x = 4;
        do {
            System.out.println(String.format("x is %s", x));
            x++;
        } while (x <= 3);
        System.out.println("---");

        System.out.println("\nFor:\n");

        for (int i = 0; i <= 3; i++) {
            System.out.println(String.format("i is %s", i));
        }
        System.out.println("---\n");

        char[] a = { 'A', 'B', 'C' };
        for (char c : a) {
            System.out.println(String.format("c is %s", c));
        }
        System.out.println("---\n");

        List<String> al = new ArrayList<>(Arrays.asList("Apple", "Google", "Facebook"));
        for (String st : al) {
            System.out.println(String.format("st is %s", st));
        }
        System.out.println("---");

        System.out.println("\nBranching - Break:\n");

        x = 0;
        while (x <= 10) {
            System.out.println(String.format("x is %s", x));
            x++;
            if (x > 3) {
                break;
            }
        }
        System.out.println("---");

        x = 0;
        breakLabel: while (x <= 5) {
            y = 0;
            while (y <= 2) {
                if (x > 2 && y > 1) {
                    break breakLabel;
                }
                System.out.println(String.format("x is %s y is %s", x, y));
                y++;
            }
            x++;
        }
        System.out.println("---");

        System.out.println("\nBranching - Continue:\n");

        int zz[][] = { { 0, 1, 2 }, { 3, 4, 5 } };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (zz[i][j] < 2) {
                    continue;
                }
                System.out.println(String.format("zz is %s", zz[i][j]));
            }
        }
        System.out.println("---\n");

        continueLabel: for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (zz[i][j] < 2) {
                    continue continueLabel;
                }
                System.out.println(String.format("zz is %s", zz[i][j]));
            }
        }
        System.out.println("---");

        System.out.println("\nBranching - Return:\n");

        noReturnValueMethod(-1);
        noReturnValueMethod(999);
        noReturnValueMethod(9);

        System.out.println("---");

        System.out.println(returnValueMethod(-1));
        System.out.println(returnValueMethod(999));
        System.out.println(returnValueMethod(9));
    }

    /**
     * Demonstrates multiple returns without return values.
     * 
     * @param value
     *            determines which action
     */
    static void noReturnValueMethod(int value) {
        if (value < 0) {
            System.out.println("Value is negative");
            return;
        } else if (value > 10) {
            System.out.println("Value is too large");
            return;
        }
        System.out.println("Value is good");
    }

    /**
     * Demonstrates multiple returns with return values.
     * 
     * @param value
     *            determines which action and return value
     * @return bad, ugly, or good string depending on parameter
     */
    static String returnValueMethod(int value) {
        if (value < 0) {
            return "Value is negative";
        } else if (value > 10) {
            return "value is too large";
        }
        return "Value is good";
    }
}
