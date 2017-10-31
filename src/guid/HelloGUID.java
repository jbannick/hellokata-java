import java.util.UUID;

public class HelloGUID {
    public static void main(String... args) {
        System.out.println("Hello GUID!");

        UUID uuid01 = UUID.randomUUID();
        UUID uuid02 = UUID.fromString(uuid01.toString());

        UUID uuid03 = UUID.randomUUID();

        System.out.printf("uuid01: %s\n", uuid01);
        System.out.printf("uuid02: %s\n", uuid02);
        System.out.printf("uuid03: %s\n", uuid03);

        System.out.printf("uuid01 == uuid02 %s\n", uuid01 == uuid02);
        System.out.printf("uuid01.equals(uuid02) %s\n", uuid01.equals(uuid02));

        System.out.printf("uuid01 == uuid03 %s\n", uuid01 == uuid03);
        System.out.printf("uuid01.equals(uuid03) %s\n", uuid01.equals(uuid03));

        System.out.printf("uuid01.compareTo(uuid02) %s\n", uuid01.compareTo(uuid02));
        System.out.printf("uuid01.compareTo(uuid03) %s\n", uuid01.compareTo(uuid03));
        System.out.printf("uuid03.compareTo(uuid01) %s\n", uuid03.compareTo(uuid01));
    }
}
