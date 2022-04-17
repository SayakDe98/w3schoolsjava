//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class multidimensionalarray {
    public multidimensionalarray() {
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}};
        System.out.println(arr[1][1]);
        System.out.println("another way:");

        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[i].length; ++j) {
                System.out.println(arr[i][j]);
            }
        }

    }
}
