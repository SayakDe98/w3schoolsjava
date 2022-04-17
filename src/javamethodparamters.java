//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class javamethodparamters{
    public javamethodparamters() {
    }

    static void myMethod(String fname) {
        System.out.println("Full Name:" + fname + " De");
    }

    static void twoparameter(String fname, int age) {
        System.out.println(fname + "'s age is:" + age);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum2(int a, int b) {
        return a + b;
    }

    static void conditional_statements(String name, int age) {
        if (age < 18) {
            System.out.println(name + " is not an adult");
        } else {
            System.out.println(name + " is an adult");
        }

    }

    public static void main(String[] args) {
        System.out.println("Name of people in my family : ");
        myMethod("Sayak");
        myMethod("Sarmistha");
        myMethod("Kamal Kumar");
        twoparameter("Liam", 18);
        twoparameter("John", 32);
        twoparameter("Cassia", 16);
        System.out.println(sum(2, 3));
        int sum = sum2(4, 6);
        System.out.println(sum);
        conditional_statements("Shyam", 17);
        conditional_statements("Raju", 22);
    }
}
