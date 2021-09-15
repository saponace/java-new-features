package j16;

public class DemoRecords {
    record Point(int x, int y) {}

    public static void main(String[] args) {
        // fancy type inference
        var point = new Point(1, 2);

        System.out.println("x = " + point.x() + ", y = " + point.y() + "");

        var points = new Point[] {point, point};
    }
}
