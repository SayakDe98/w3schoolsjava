//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class methodoverloading {
    public methodoverloading() {
    }

    static int add_int(int x, int y) {
        return x + y;
    }

    static double add_double(double x, double y) {
        return x + y;
    }

    static int add(int x, int y) {
        return x + y;
    }

    static double add(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("Using two seperate function names:");
        System.out.println(add_int(1, 2));
        System.out.println(add_double(1.22, 2.788));
        System.out.println("Using method overloading(that is by using same name of function for two different functions or methods");
        System.out.println(add(2, 5));
        System.out.println(add(1.81, 1.2));
    }
}
