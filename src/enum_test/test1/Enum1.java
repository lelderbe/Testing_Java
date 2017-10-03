package enum_test.test1;

/**
 * Created by user on 20.04.2017.
 */
public enum Enum1 implements EnumInterface {
    Customer("Customer"),
    Bank("Bank Name");

    private String fullname;

    @Override
    public String getFullname() {
        return fullname;
    }

    private Enum1(String fullname) {
        this.fullname = fullname;
    }
}
