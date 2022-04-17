//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class javatypecasting {
    public javatypecasting() {
    }

    public static void main(String[] args) {
        int i1 = 9;
        double d1 = (double)i1;
        System.out.println("before automatic(widening) casting " + i1);
        System.out.println("after manual(widening) casting " + d1);
        System.out.println("");
        double d2 = 77.98;
        int i2 = (int)d2;
        System.out.println("before manual(narrowing) casting " + i1);
        System.out.println("after manual(narrowing) casting " + d1);
    }
}
