//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class arrays {
    public arrays() {
    }

    public static void main(String[] args) {
        String[] cars = new String[]{"Mazda", "BMW", "Corolla", "Porsche"};
        int[] var10000 = new int[]{1, 2, 3, 4, 5};
        System.out.println("Value of cars at index 0 before changing it : " + cars[0]);
        cars[0] = "Lamborgini";
        System.out.println("Value of cars at index 0 after changing it : " + cars[0]);
        System.out.println("Length of cars array : " + cars.length);
    }
}
