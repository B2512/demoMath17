package b2512.yeqingnan;

import java.util.Arrays;

public class Main {
    public static int[] scale3 = {3, 0, 0, 3};

    public static int[] line(int[] data1, int[] data2) {
        int x = data1[0] * data2[0] + data1[2] * data2[1];
        int y = data1[1] * data2[0] + data1[3] * data2[1];
        return new int[]{x, y};
    }

    public static void main(String[] args) {
        reShape(scale3,
                new int[]{20, 20},
                new int[]{40, 60},
                new int[]{80, 40}
        );
        reShape(scale3,
                new int[]{20, 20},
                new int[]{40, 60},
                new int[]{80, 40}
        );
    }

    public static void reShape(int[] transform, int[] a, int[] b, int[] c) {
        int[][] result = new int[3][];
        result[0] = line(transform, a);
        result[1] = line(transform, b);
        result[2] = line(transform, c);
        // return result;
        System.out.println("pics.push([" + Arrays.toString(result[0]) + ", " + Arrays.toString(result[1]) + ", " + Arrays.toString(result[2]) + "]);");
    }

    ;
}
