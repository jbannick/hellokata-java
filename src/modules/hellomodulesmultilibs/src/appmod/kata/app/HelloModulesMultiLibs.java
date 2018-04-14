package kata.app;

public class HelloModulesMultiLibs {

    public static void main(String... args) {
        System.out.println("Hello Modules Using Multiple Libraries");

        JSONWriter jsonWriter = new JSONWriter();
        CSVReader  csvReader = new CSVReader();
    }
}
