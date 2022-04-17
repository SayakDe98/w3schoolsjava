//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class recursion {
    public recursion() {
    }

    static int sum(int n) {
        return n > 0 ? sum(n - 1) + n : 0;
    }

    static int rangedsum(int start, int end) {
        return end > start ? end + rangedsum(start, end - 1) : end;
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println("Ranged sum:");
        System.out.println(rangedsum(5, 11));
    }
}
