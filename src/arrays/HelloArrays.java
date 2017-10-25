import java.util.Arrays;

public class HelloArrays {
	public static void main(String...args) {
		System.out.println("Hello Arrays!");
		byte[]    a1 = {1, 2, 3};
		short[]   a2 = {1, 2, 3};
		int[]     a3 = {1, 2, 3};
		long[]    a4 = {1L, 2L, 3L};
		float[]   a5 = {1.0f, 2.0f, 3.0f};
		double[]  a6 = {1.0d, 2.0d, 3.0d};
		char[]    a7 = {'a', 'b', 'c'};
		boolean[] a8 = {true, false};
		String[]  a9 = {"aaa", "bbb", "ccc"};
		
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(a3));
		System.out.println(Arrays.toString(a4));
		System.out.println(Arrays.toString(a5));
		System.out.println(Arrays.toString(a6));
		System.out.println(Arrays.toString(a7));
		System.out.println(Arrays.toString(a8));
		System.out.println(Arrays.toString(a9));
		
		String[][] names = 
			{
				{"Mr.", "Mrs.", "Ms."},
				{"Smith", "Jones"}
			};
		System.out.println(Arrays.deepToString(names));
		
		int[][][] coords =
			{
					{ { 0,  1,  2}, { 3,  4,  5}, { 6,  7,  8} },
					{ { 9, 10, 11}, {12, 13, 14}, {15, 16, 17} },
					{ {18, 19, 20}, {21, 22, 23}, {24, 25, 26} }
			};
		System.out.println(Arrays.deepToString(coords));
		
		int[][][] coords2 = new int[3][3][3];
		int val = 0;
		for (int i = 0; i < 3; i++) {
			for( int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					coords2[i][j][k] = val++;
				}
			}
		}
		System.out.println(Arrays.deepToString(coords2));
		
		char[] aa1 = {'a', 'b', 'c', 'd', 'e'};
		char[] aa2 = new char[3];
		System.arraycopy(aa1, 2, aa2, 0, 2);
		System.out.println(Arrays.toString(aa2));
		aa1[2] = 'z';
		System.out.println(Arrays.toString(aa1));
		System.out.println(Arrays.toString(aa2));

		// Instantiates new one-dimension array
		// Values are COPIES of values in original array
		int[] aa3 = {1, 2, 3, 4, 5};
		int[] aa4 = Arrays.copyOf(aa3, 5);
		System.out.println(Arrays.toString(aa3));
		aa3[2] = 999;
		System.out.println(Arrays.toString(aa3));
		System.out.println(Arrays.toString(aa4));
		System.out.println(aa3);
		System.out.println(aa4);
		
		// Instantiates new multidimensional array
		// But 2nd level values are REFERENCES to original array.
		int[][][] coords3 = Arrays.copyOf(coords, 3);
		System.out.println(coords);
		System.out.println(coords3);
		System.out.println(Arrays.deepToString(coords3));
		coords[0][0][0] = 999;
		System.out.println(Arrays.deepToString(coords));
		System.out.println(Arrays.deepToString(coords3));
		System.out.println(Arrays.toString(coords));
		System.out.println(Arrays.toString(coords3));
	}
}
