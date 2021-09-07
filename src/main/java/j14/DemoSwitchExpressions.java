package j14;

import java.util.Arrays;

public class DemoSwitchExpressions {
    public static String multiSwitch(int day) {
        return switch (day) {
            case 1, 2, 3, 4, 5 -> "workday";
            case 6, 7 -> "weekend";
            default -> "invalid";
        };
    }

    public static void switchExpression(int v) {
        System.out.println( "number is :" +
                switch (v) {
                    case  1 -> "one";
                    case  2 -> "two";
                    default -> "many";
                }
        );
    }

    public static void main(String[] args) {
        System.out.println(multiSwitch(1));
        switchExpression(2);

    }
}
