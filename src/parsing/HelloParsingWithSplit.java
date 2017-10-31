public class HelloParsingWithSplit {

    private static String string01 = "My name is Ozymandias";

    private static String string02 = 
        "We hold these truths to be self-evident, " + "that all men are created equal, "
        + "that they are endowed by their Creator with certain unalienable Rights, "
        + "that among these are Life, Liberty and the pursuit of Happiness.";

    public static void main(String... args) {
        System.out.println("Hello Parsing with Split!");

        String[] words = string01.split(" ");

        System.out.println("string.split(\" \"); yields:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    // TODO: Complete this Kata
}
