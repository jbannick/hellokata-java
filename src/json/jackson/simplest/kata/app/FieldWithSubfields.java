package kata.app;

import java.util.Arrays;

public class FieldWithSubfields extends Field{

    private Field[] subfields;

    public FieldWithSubfields(final String name, final Field[] subfields) {
        super(name, 1, false, null);
        this.subfields = Arrays.copyOf(subfields, subfields.length);
    }

    public Field[] getSubfields() {
        return subfields;
    }
}
