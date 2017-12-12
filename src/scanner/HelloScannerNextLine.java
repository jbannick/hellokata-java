import java.util.Scanner;

public class HelloScannerNextLine {
    /**
     * Poem by Leigh Hunt.
     */
    public static void main(String... args) {
        System.out.println("Hello Scanner Next Line!");

        String string = 
              "    Jenny kiss'd me when we met,\n" 
            + "    Jumping from the chair she sat in;\n"
            + "    Time, you thief, who love to get\n" 
            + "    Sweets into your list, put that in!\n"
            + "    Say I'm weary, say I'm sad,\n" 
            + "    Say that health and wealth have missed me,\n"
            + "    Say I'm growing old, but add\n" 
            + "    Jenny kiss'd me.";

        System.out.println("---");

        try (Scanner sc = new Scanner(string)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
    }
}
