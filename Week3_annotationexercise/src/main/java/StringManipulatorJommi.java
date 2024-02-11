public class StringManipulatorJommi {
    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public String capitalize(String s) {
        return s.toUpperCase();
    }
}
