import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloRegex {
	public static void main(String...args) {
		System.out.println("Hello Regex!");
		
		findIt("foo", "foo");
		findIt("foo", "foofoofoo");
		
		findIt("cat.", "cats");
		
		findIt("[bcr]at", "bat");
		findIt("[bcr]at", "cat");
		findIt("[bcr]at", "rat");
		findIt("[bcr]at", "hat");
		
		findIt("[^bcr]at", "bat");
		findIt("[^bcr]at", "cat");
		findIt("[^bcr]at", "rat");
		findIt("[^bcr]at", "hat");
		
		findIt("[a-c]", "a");
		findIt("[a-c]", "b");
		findIt("[a-c]", "c");
		findIt("[a-c]", "d");

	}
	
	static void findIt(String regexString, String stringToSearch) {
		Pattern pattern = Pattern.compile(regexString);
		Matcher matcher = pattern.matcher(stringToSearch);
		boolean found = false;
		while (matcher.find()) {
			System.out.printf("I found the text" +
                    " \"%s\" starting at " +
                    "index %d and ending at index %d.%n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
			found = true;
		} 
		if (!found){
			System.out.printf("No match for regexString<%s> stringToSearch<%s>\n", regexString, stringToSearch);
		}
	}
}
