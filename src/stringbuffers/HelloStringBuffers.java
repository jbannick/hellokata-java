
public class HelloStringBuffers {
	public static void main(String...args) {
		System.out.println("Hello StringBuffers!");
		
		StringBuffer sb = new StringBuffer("uvw"); String s8 = new String(sb);
		sb.append("XYZ");
		StringBuilder sbb = new StringBuilder("xyz"); String s9 = new String(sbb);
		sbb.insert(0, "UVW");
		
		System.out.println(sb);
		System.out.println(sbb);
		
		//TODO: VARIATIONS ON APPEND, INSERT, DELETE, INDEXOF, REPLACE, REVERSE, SUBSETS
		
		//TODO: PLAY WITH CAPACITY, SETLENGTH, TRIM
		
		//TODO: CODEPOINTS?

	}
}
