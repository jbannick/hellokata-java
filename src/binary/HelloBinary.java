
public class HelloBinary {

    static boolean DEBUG = false;

    public static void main(String... args) {
        System.out.println("Hello Binary!\n");
        DEBUG = true;

        System.out.println(getBinaryStringSimple(Integer.MAX_VALUE));
        System.out.println(getBinaryStringSimple(Integer.MIN_VALUE));
        System.out.println(getBinaryStringSimple(1));
        System.out.println(getBinaryStringSimple(0));
        System.out.println(getBinaryStringSimple(-1));

        System.out.println("\n---\n");

        byte byte1 = Byte.MIN_VALUE + 1;
        byte byte2 = Byte.MIN_VALUE + 2;
        System.out.println(getBinaryString(Byte.MAX_VALUE));
        System.out.println(getBinaryString(byte1));
        System.out.println(getBinaryString(byte2));
        System.out.println(getBinaryString(Byte.MIN_VALUE));

        short short1 = Short.MIN_VALUE + 1;
        short short2 = Short.MIN_VALUE + 2;
        System.out.println(getBinaryString(Short.MAX_VALUE));
        System.out.println(getBinaryString(short1));
        System.out.println(getBinaryString(short2));
        System.out.println(getBinaryString(Short.MIN_VALUE));

        int int1 = Integer.MIN_VALUE + 1;
        int int2 = Integer.MIN_VALUE + 2;
        System.out.println(getBinaryString(Integer.MAX_VALUE));
        System.out.println(getBinaryString(int1));
        System.out.println(getBinaryString(int2));
        System.out.println(getBinaryString(Integer.MIN_VALUE));

        long long1 = Long.MIN_VALUE + 1L;
        long long2 = Long.MIN_VALUE + 2L;
        System.out.println(getBinaryString(Long.MAX_VALUE));
        System.out.println(getBinaryString(long1));
        System.out.println(getBinaryString(long2));
        System.out.println(getBinaryString(Long.MIN_VALUE));

        System.out.println("\n---\n");

        System.out.println(Byte.parseByte(getBinaryString(Byte.MAX_VALUE).replaceAll("_", ""), 2));
        System.out.println((byte) Integer.parseInt(getBinaryString(byte1).replaceAll("_", ""), 2));
        System.out.println((byte) Integer.parseInt(getBinaryString(byte2).replaceAll("_", ""), 2));
        System.out.println((byte) Integer.parseInt(getBinaryString(Byte.MIN_VALUE).replaceAll("_", ""), 2));

        System.out.println(Short.parseShort(getBinaryString(Short.MAX_VALUE).replaceAll("_", ""), 2));
        System.out.println((short) Integer.parseInt(getBinaryString(short1).replaceAll("_", ""), 2));
        System.out.println((short) Integer.parseInt(getBinaryString(short2).replaceAll("_", ""), 2));
        System.out.println((short) Integer.parseInt(getBinaryString(Short.MIN_VALUE).replaceAll("_", ""), 2));

        System.out.println(Integer.parseInt(getBinaryString(Integer.MAX_VALUE).replaceAll("_", ""), 2));
        System.out.println((int) Long.parseLong(getBinaryString(int1).replaceAll("_", ""), 2));
        System.out.println((int) Long.parseLong(getBinaryString(int2).replaceAll("_", ""), 2));
        System.out.println((int) Long.parseLong(getBinaryString(Integer.MIN_VALUE).replaceAll("_", ""), 2));

        System.out.println(Long.parseLong(getBinaryString(Long.MAX_VALUE).replaceAll("_", ""), 2));
        System.out.println((long) Long.parseUnsignedLong(getBinaryString(long1).replaceAll("_", ""), 2));
        System.out.println((long) Long.parseUnsignedLong(getBinaryString(long2).replaceAll("_", ""), 2));
        System.out.println(Long.parseLong("-" + getBinaryString(Long.MIN_VALUE).replaceAll("_", ""), 2));

        // TODO: Complete this Kata
    }

    static String getBinaryString(Number valp) {
        // Determine bit count
        int countBits = 0;
        if (valp instanceof Byte) {
            countBits = Byte.SIZE;
        } else if (valp instanceof Short) {
            countBits = Short.SIZE;
        } else if (valp instanceof Integer) {
            countBits = Integer.SIZE;
        } else if (valp instanceof Long) {
            countBits = Long.SIZE;
        } else {
            countBits = Long.SIZE;
        }
        if (DEBUG) {
            System.out.println(countBits);
        }
        long val = valp.longValue();
        if (DEBUG) {
            System.out.println(val);
        }
        // Get binary string from Long value
        StringBuilder sb = new StringBuilder(
                String.format("%1$" + countBits + "s", Long.toBinaryString(val)).replace(' ', '0'));
        if (DEBUG) {
            System.out.println(sb);
        }
        // Trim off excess zeroes
        if (sb.length() > countBits) {
            if (valp instanceof Byte || valp instanceof Short) {
                sb.delete(0, sb.length() - countBits);
            } else {
                sb.delete(0, countBits);
            }
        }
        if (DEBUG) {
            System.out.println(sb);
        }
        // Insert underscores
        for (int i = countBits - 1; i > 3; i--) {
            if (i % 4 == 0) {
                sb.insert(i, '_');
            }
        }
        return sb.toString();
    }

    // This one is not generic
    static String getBinaryStringSimple(int val) {
        StringBuilder sb = new StringBuilder(String.format("%1$32s", Integer.toBinaryString(val)).replace(' ', '0'));
        for (int i = 31; i > 3; i--) {
            if (i % 4 == 0) {
                sb.insert(i, '_');
            }
        }
        return sb.toString();
    }
}
