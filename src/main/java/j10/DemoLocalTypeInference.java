package j10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoLocalTypeInference {

    private static void testLocalTypeInference() {
        var a = "coucou";
        var b = 12;

        System.out.println("Type of a: " + a.getClass().getName());
        System.out.println("Type of b: " + ((Object) b).getClass().getName());

//        b = "yoyo";

//        var c = new ArrayList<>;
    }

    private static void testLocalTypeInferenceInLambdas() {
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        String retVal = l.stream()
                .map((var e) -> e+1)
                .map(Object::toString)
                .collect(Collectors.joining());

        System.out.println(retVal);
    }

    public static void main(String[] args) {
        testLocalTypeInference();
        testLocalTypeInferenceInLambdas();
    }
}
