
// dont define as public, can only be one public class per file (and filename)
class YourClass {

    // returns integer therefore not void
    public static Integer getValue() {
        int val_int = 5;
        return val_int;
    }

    // does not return anything (void) only one main as well
    public void print_value(String[] args) {
        int val = getValue();
        String string_val = Integer.toString(val);
        System.out.println(string_val);
    }
}

public class passingBetweenClasses {
    public static void main(String[] args) {
        // instantiate
        YourClass cl = new YourClass();
        cl.print_value(args);
    }

}