package kata.app;

public class Field {
    private String name;

    public Field(final String name){
        this.name = name;
    }

    public Field(final String name, final Field[] subfields) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
