package j9;

interface InterfaceWithPrivateMethods {

    void mul(int a, int b);

    default void add(int a, int b) {
        System.out.print("Answer by Default method (calling private method) = ");
        System.out.println(addAux(a, b));
    }

    private int addAux(int a, int b) {
        return a + b;
    }

    static void mod(int a, int b) {
        System.out.print("Answer by Static method = ");
        System.out.println(a % b);
    }
}

class DemoPrivateMethodInInterface implements InterfaceWithPrivateMethods {

    @Override
    public void mul(int a, int b) {
        System.out.print("Answer by Abstract method = ");
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        InterfaceWithPrivateMethods in = new DemoPrivateMethodInInterface();

        System.out.println("===== Mul =====");
        in.mul(2, 3);

        System.out.println("===== Add =====");
        in.add(6, 2);

        System.out.println("===== Mod =====");
        InterfaceWithPrivateMethods.mod(5, 3);
    }
}