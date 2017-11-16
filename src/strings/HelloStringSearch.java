public class HelloStringSearch {
    static private String string = "\"My name is Ozymandias, king of kings:\n" + 
            "Look on my works, ye Mighty, and despair!\"";
    
	public static void main(String...args) {
		System.out.println("Hello String Search!");
		
		System.out.printf("\n%s\n\n", string);
		
		// 1. Forward Search

	      int idx01 = string.indexOf('O');
	      int idx02 = string.indexOf('M', idx01);
	      int idx03 = string.indexOf("kings");
          int idx04 = string.indexOf("and", idx03);

          System.out.printf("string.indexOf('O'); = %s\n", string.substring(idx01, idx01 + 10));
          System.out.printf("string.indexOf('M', idx01); = %s\n", string.substring(idx02, idx02 + 6));
          System.out.printf("string.indexOf(\"kings\"); = %s\n", string.substring(idx03, idx03 + 5));
          System.out.printf("string.indexOf(\"and\", idx03); = %s\n", string.substring(idx04, idx04 + 3));

		// 2. Backward Search
		
          int idx11 = string.lastIndexOf('a');
          int idx12 = string.lastIndexOf('i', idx11);
          int idx13 = string.lastIndexOf("and");
          int idx14 = string.lastIndexOf("and", --idx13);

          System.out.println("---");
          System.out.printf("string.lastIndexOf('a'); = %s\n", string.substring(idx11));
          System.out.printf("string.lastIndexOf('i', idx11); = %s\n", string.substring(idx12, idx12 + 6));
          System.out.printf("string.lastIndexOf(\"and\"); = %s\n", string.substring(idx13, idx13 + 13));
          System.out.printf("string.lastIndexOf(\"and\", --idx13); = %s\n", string.substring(idx14, idx14 + 6));

		// 3. Contains

          boolean containsPhilip = string.contains("Philip");
          System.out.println("---");
          System.out.printf("string.contains(\"Philip\"); = %s\n", containsPhilip);	        
	}
}
