//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class arrayusingloop {
    public arrayusingloop() {
    }

    public static void main(String[] args) {
        String[] employees = new String[]{"Ram", "Shyam", "Raju", "Akash"};

        int i;
        for(i = 0; i < 4; ++i) {
            System.out.println(employees[i]);
        }

        System.out.println("another way:");

        for(i = 0; i < employees.length; ++i) {
            System.out.println(employees[i]);
        }

        System.out.println("another way:");
        String[] var6 = employees;
        int var3 = employees.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String j = var6[var4];
            System.out.println(i);
        }

    }
}
