package j9;

import java.util.Optional;

public class DemoNewOptionalMethods {
    public static void printPersonById(Long id) {
        Optional<String> personOpt = id == 10 ? Optional.of("person " + id) : Optional.empty();
        personOpt.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Person not found")
        );
    }
    public static String getPerson(Long id) {
        Optional<String> personOpt = id == 10 ? Optional.of("person " + id) : Optional.empty();
        return personOpt.orElseThrow(() -> new RuntimeException("Person not found"));
    }

    public static void main(String[] args) {
        System.out.println("===== Print person present");
        printPersonById(10L);
        System.out.println("===== Print person not present");
        printPersonById(11L);

        System.out.println("===== Get person present");
        System.out.println(getPerson(10L));
//        System.out.println("===== Get person not present");
//        System.out.println(getPerson(11L));
    }
}
