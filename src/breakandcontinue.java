//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class breakandcontinue {
    public breakandcontinue() {
    }

    public static void main(String[] args) {
        int i;
        for(i = 0; i < 10 && i != 4; ++i) {
            System.out.println(i);
        }

        System.out.println("next loop");

        for(i = 0; i < 10; ++i) {
            if (i != 4) {
                System.out.println(i);
            }
        }

        System.out.println("next loop");
        i = 0;

        while(i < 10) {
            System.out.println(i);
            ++i;
            if (i == 4) {
                ++i;
                break;
            }
        }

        System.out.println("next loop");
        i = 0;

        while(i < 10) {
            if (i == 4) {
                ++i;
            } else {
                System.out.println(i);
                ++i;
            }
        }

    }
}
