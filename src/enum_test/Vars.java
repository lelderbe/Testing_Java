package enum_test;

/**
 * Created by user on 19.03.2017.
 */
public enum Vars {
    VARIANT1,
    VARIANT2,
    VARIANT3;


    @Override
    public String toString() {
        switch (this) {
            case VARIANT1: return "Variant 1";
            case VARIANT2: return "2222222";
            case VARIANT3: return "VAR 3333333";
            default: return "";
        }
    }
}
