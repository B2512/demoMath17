package b2512.huangsai;

import java.util.Arrays;

public class Linear {
    public static double[] line(double[] data1, double[] data2) {
        double x = data1[0] * data2[0] + data1[2] * data2[1];
        double y = data1[1] * data2[0] + data1[3] * data2[1];
        return new double[]{x, y};
    }

    public static void reShape(double[] transform) {
        double[] a = new double[]{20,20};
        double[] b = new double[]{40, 60};
        double[] c = new double[]{80, 40};
        double[][] result = new double[3][];
        result[0] = line(transform, a);
        result[1] = line(transform, b);
        result[2] = line(transform, c);
        // return result;
        System.out.println("pics.push([" + Arrays.toString(result[0]) + ", " + Arrays.toString(result[1]) + ", " + Arrays.toString(result[2]) + "]);");
    }
}
