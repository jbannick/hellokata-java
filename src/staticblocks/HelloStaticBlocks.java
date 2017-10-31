public class HelloStaticBlocks {

    static {
        System.out.println("Static block 1");
        mValue1 = 123;
    }

    static {
        System.out.println("Static block 2");
        setValue2(456);
    }

    static int mValue1;
    static int mValue2;

    public static void main(String... args) {
        System.out.println("Hello Static Blocks!");

        System.out.printf("value1 = %s\n", mValue1);
        System.out.printf("value2 = %s\n", mValue2);
    }

    static void setValue2(int value) {
        mValue2 = value;
    }
}
