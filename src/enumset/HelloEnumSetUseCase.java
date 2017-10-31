import java.util.EnumSet;

enum Operation {
    VIEW_PROFILE, EDIT_PROFILE, DELETE_PROFILE, RATE_PROFILE, 
    VIEW_ALBUM, EDIT_ALBUM, DELETE_ALBUM, COMMENT
}

enum Role {
    SELF(EnumSet.of(Operation.VIEW_PROFILE, 
            Operation.EDIT_PROFILE, Operation.DELETE_PROFILE, Operation.VIEW_ALBUM,
            Operation.EDIT_ALBUM, Operation.DELETE_ALBUM, Operation.COMMENT)),

    FRIEND(EnumSet.of(Operation.VIEW_ALBUM, Operation.VIEW_PROFILE, Operation.COMMENT)),

    GUEST(EnumSet.of(Operation.VIEW_PROFILE, Operation.RATE_PROFILE));

    EnumSet<Operation> operationSet;

    Role(EnumSet<Operation> operationSet) {
        this.operationSet = operationSet;
    }
}

public class HelloEnumSetUseCase {
    public static void main(String... args) {
        System.out.println("Hello EnumSet Use Case!");

        EnumSet<Operation> customRole = EnumSet.noneOf(Operation.class);
        customRole.addAll(Role.FRIEND.operationSet);
        customRole.addAll(Role.GUEST.operationSet);

        System.out.println(customRole);
    }
}
