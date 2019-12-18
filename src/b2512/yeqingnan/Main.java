package b2512.yeqingnan;

import java.util.Arrays;

import static b2512.huangsai.Linear.reShape;

public class Main {
    public static double[] scale3 = {3, 0, 0, 3};
    public static double[] rotate45 = {Math.cos(Math.toRadians(45.0)), -Math.sin(Math.toRadians(45.0)), Math.sin(Math.toRadians(45.0)), Math.cos(Math.toRadians(45.0))};
    public static double[] rotate230 = {Math.cos(Math.toRadians(230.0)), -Math.sin(Math.toRadians(230.0)), Math.sin(Math.toRadians(230.0)), Math.cos(Math.toRadians(230.0))};
    public static double[] shearX20 = {1, 0, Math.tan(Math.toRadians(20)), 1};
    public static double[] shearX40 = {1, 0, Math.tan(Math.toRadians(40)), 1};
    public static double[] shearY20 = {1, Math.tan(Math.toRadians(20)), 0, 1};
    public static double[] shearY40 = {1, Math.tan(Math.toRadians(40)), 0, 1};
    public static double[] reflectO = {-1, 0, 0, -1};
    public static double[] reflectX = {1, 0, 0, -1};
    public static double[] reflectY = {-1, 0, 0, 1};

    public static double[] line(double[] data1, double[] data2) {
        double x = data1[0] * data2[0] + data1[2] * data2[1];
        double y = data1[1] * data2[0] + data1[3] * data2[1];
        return new double[]{x, y};
    }

    public static void main(String[] args) {
        reShape(scale3);
        reShape(rotate45);
        reShape(rotate230);
        reShape(shearX20);
        reShape(shearX40);
        reShape(shearY20);
        reShape(shearY40);
        reShape(reflectO);
        reShape(reflectX);
        reShape(reflectY);
    }

    public static void reShape(double[] transform) {
        double[] a = new double[]{20, 20};
        double[] b = new double[]{40, 60};
        double[] c = new double[]{80, 40};
        double[][] result = new double[3][];
        result[0] = line(transform, a);
        result[1] = line(transform, b);
        result[2] = line(transform, c);
        // return result;
        System.out.println("pics.push([" + Arrays.toString(result[0]) + ", " + Arrays.toString(result[1]) + ", " + Arrays.toString(result[2]) + "]);");
    }

    ;
}
