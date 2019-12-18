package b2512.huangsai;

import static b2512.huangsai.Linear.reShape;

public class Main {
    public static double[] scale3 = {3, 0, 0, 3};
    public static double[] rotate45 = {Math.cos(Math.toRadians(45.0)), -Math.sin(Math.toRadians(45.0)), Math.sin(Math.toRadians(45.0)), Math.cos(Math.toRadians(45.0))};
    public static double[] rotate230 = {Math.cos(Math.toRadians(230.0)), -Math.sin(Math.toRadians(230.0)), Math.sin(Math.toRadians(230.0)), Math.cos(Math.toRadians(230.0))};
    public static double[] shearX20 = {1, 0, Math.tan(Math.toRadians(20.0)), 1};
    public static double[] shearX40 = {1, 0, Math.tan(Math.toRadians(40.0)), 1};
    public static double[] shearY20 = {1, Math.tan(Math.toRadians(20.0)), 0, 1};
    public static double[] shearY40 = {1, Math.tan(Math.toRadians(40.0)), 0, 1};
    public static double[] reflectO = {-1, 0, 0, -1};
    public static double[] reflectX = {1, 0, 0, -1};
    public static double[] reflectY = {-1, 0, 0, 1};


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
}
