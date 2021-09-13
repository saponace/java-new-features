package j9;

public class DemoDiamondOperatorForAnonymousInnerClasses {
    public static void main(String[] args) {
        Adder<Integer> obj = new Adder<>() {
            Integer add(Integer x, Integer y) {
                return x+y;
            }
        };
        Integer sum = obj.add(100,101);
        System.out.println(sum);
    }

    static abstract class Adder<T>{
        abstract T add(T num, T num2);
    }
}
