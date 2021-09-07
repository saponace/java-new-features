package j9;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DemoCollectionFactoryMethods {
    public static void main(String[] args) {
        Map<Integer, String> yoMap = Map.of(1, "one", 2, "two", 3, "three");
        Set<Integer> yoSet = Set.of(1, 2, 3, 4, 5);

        List<Integer> yoList = List.of(1, 2, 3, 4, 5);
        String retVal = yoList.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
        System.out.println(retVal);

//        yoSet.add(6);
    }
}
