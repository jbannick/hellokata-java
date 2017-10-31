enum Bills {
    ONE(1), FIVE(5), TEN(10), TWENTY(20);
    private int value;
    private String desc;

    private Bills(int value) {
        this.value = value;
        switch (this.value) {
        case 1:
            this.desc = "buck";
            break;
        case 5:
            this.desc = "fin";
            break;
        case 10:
            this.desc = "sawbuck";
            break;
        case 25:
            this.desc = "Jackson";
            break;
        }
    }

    public void setDescription(String desc) {
        this.desc = desc;
    }

    public String getDescription() {
        return this.desc;
    }
}

public class HelloEnumsAccessControl {

    enum Coins {
        PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
        private int value;
        private String desc;

        private Coins(int value) {
            this.value = value;
            switch (this.value) {
            case 1:
                this.desc = "penny";
                break;
            case 5:
                this.desc = "nickle";
                break;
            case 10:
                this.desc = "dime";
                break;
            case 25:
                this.desc = "quarter";
                break;
            }
        }
    }

    public static void main(String... args) {
        System.out.println("Hello Enums Access Control!");

        Coins coin = Coins.QUARTER;

        String desc01 = Coins.QUARTER.desc;
        System.out.printf("Before setting description, Coins.QUARTER.desc = %s\n", desc01);

        String desc02 = coin.desc;
        System.out.printf("Before setting description, coin.desc = %s\n", desc02);

        System.out.println("---");

        Coins.QUARTER.desc = "two bits";

        String desc03 = Coins.QUARTER.desc;
        System.out.printf("After Coins.QUARTER.desc = \"two bits\"; Coins.QUARTER.desc = %s\n", desc03);

        String desc04 = coin.desc;
        System.out.printf("After Coins.QUARTER.desc = \"two bits\"; coin.desc = %s\n", desc04);

        System.out.println("---");

        coin.desc = "25 cents";

        String desc05 = Coins.QUARTER.desc;
        System.out.printf("After coin.desc = \"25 cents\";  Coins.QUARTER.desc = %s\n", desc05);

        String desc06 = coin.desc;
        System.out.printf("After coin.desc = \"25 cents\";  coin.desc = %s\n", desc06);

        System.out.println("---");

        Bills bill = Bills.FIVE;

        // Not accessible without a getter method.
        // System.out.printf("bill.desc = %s\n", bill.desc);
        // System.out.printf("bill.desc = %s\n", Bills.FIVE.desc);

        String desc07 = Bills.FIVE.getDescription();
        System.out.printf("Before setting description, Bills.FIVE.getDescription() = %s\n", desc07);

        String desc08 = bill.getDescription();
        System.out.printf("Before setting description, bill.getDescription() = %s\n", desc08);

        System.out.println("---");

        bill.setDescription("five-spot");

        String desc09 = Bills.FIVE.getDescription();

        System.out.printf("After setting descriptionl, Bills.FIVE.getDescription() = %s\n", desc09);

        String desc10 = bill.getDescription();
        System.out.printf("After setting description,  bill.getDescription() = %s\n", desc10);
    }
}
