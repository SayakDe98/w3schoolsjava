//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class ifelseswitch {
    public ifelseswitch() {
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        if (x < y) {
            System.out.println("x is less than y");
        }

        int z = 6;
        int a = 6;
        if (z > a) {
            System.out.println("z greater than a");
        } else {
            System.out.println("z is less than equal to a");
        }

        int c = 10;
        int d = 15;
        if (c == d) {
            System.out.println("c equals d");
        } else if (c > d) {
            System.out.println("c greater than d");
        } else {
            System.out.println("c is less than d");
        }

        int time = 20;
        String result = time > 18 ? "Good day" : "Bad day";
        System.out.println(result);
        int day = 4;
        switch (day) {
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Looking forward to next week");
        }

    }
}
