public class HelloEnumsOverriddenMethod {

    public enum Department {
        HR("Dept-01") {
            public String getDeptCode() {
                return "NOT ACCESSIBLE";
            }
        },
        OPS("Dept-02"), FIN("Dept-03");

        private String deptCode;

        Department(String deptCode) {
            this.deptCode = deptCode;
        }

        public String getDeptCode() {
            return this.deptCode;
        }
    }

    public static void main(String... args) {
        System.out.println("Hello Enums Overridden Method!");

        for (Department dept2 : Department.values()) {
            String deptCode = dept2.getDeptCode();
            System.out.printf("Dept = %s, Code = %s\n", dept2, deptCode);
        }
    }
}
