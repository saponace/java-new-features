package j16;

public class DemoInstanceofPatternMatching {
    public static void main(String[] args) {
        Object obj = "yoyo";

        if (obj instanceof String s) {
            System.out.println(s.length());
        }
    }
}
