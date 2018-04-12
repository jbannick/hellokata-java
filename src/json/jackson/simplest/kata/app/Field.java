package kata.app;

public class Field {
    private String name;
    private int count;
    private boolean discount;
    private String notes;

    public Field(final String name, final int count, final boolean discount, final String notes){
        this.name = name;
        this.count = count;
        this.discount = discount;
        this.notes = notes;
    }

    public String getname() {
        return name;
    }

    public int getcount() {
        return count;
    }

    public boolean getdiscount() {
        return discount;
    }

    public String getnotes() {
        return notes;
    }
}
