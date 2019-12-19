package b2512.wuzhangjie;

import java.util.Arrays;

public class Main {

    public static double[] scale3 = new double[]{3,0,0,3};

    public static double[] rotate45 = new double[]{Math.cos(Math.toRadians(45.0)),-Math.sin(Math.toRadians(45.0)),Math.sin(Math.toRadians(45.0)),Math.cos(Math.toRadians(45.0))};
    public static double[] rotate230 = new double[]{Math.cos(Math.toRadians(230.0)),-Math.sin(Math.toRadians(230.0)),Math.sin(Math.toRadians(230.0)),Math.cos(Math.toRadians(230.0))};

    public static double[] shearX20 = new double[]{1,0,Math.tan(Math.toRadians(20)),1};
    public static double[] shearX40 = new double[]{1,0,Math.tan(Math.toRadians(40)),1};

    public static double[] shearY20 = new double[]{1,Math.tan(Math.toRadians(20)),0,1};
    public static double[] shearY40 = new double[]{1,Math.tan(Math.toRadians(40)),0,1};

    public static double[] reflectO = new double[]{-1,0,0,-1};
    public static double[] reflectX = new double[]{1,0,0,-1};
    public static double[] reflectY = new double[]{-1,0,0,1};



    public static double[] line(double[] data1,double[] data2){
        double x = (data1[0] * data2[0]) + (data1[2] * data2[1]);
        double y = (data1[1] * data2[0]) + (data1[3] * data2[1]);
        return new double[]{x,y};
    }

    public static void reShape(double[] transform,double[] a,double[] b,double[] c){
        double[][] result = new double[3][];
        result[0] =line(transform,a);
        result[1] =line(transform,b);
        result[2] =line(transform,c);
        System.out.println("pics.push([" + Arrays.toString(result[0]) + ", " + Arrays.toString(result[1]) + ", " + Arrays.toString(result[2]) + "]);");
    }

    public static void main(String[] args) {
        reShape(
                scale3,
                new double[]{20, 20},
                new double[]{40, 60},
                new double[]{80, 40}
        );
        reShape(
                rotate45,
                new double[]{20, 20},
                new double[]{40, 60},
                new double[]{80, 40}
        );
        reShape(
                rotate230,
                new double[]{20, 20},
                new double[]{40, 60},
                new double[]{80, 40}
        );
        reShape(
                shearX20,
                new double[]{20, 20},
                new double[]{40, 60},
                new double[]{80, 40}
        );
        reShape(
                shearX40,
                new double[]{20, 20},
                new double[]{40, 60},
                new double[]{80, 40}
        );
        reShape(
                shearY20,
                new double[]{20, 20},
                new double[]{40, 60},
                new double[]{80, 40}
        );
        reShape(
                shearY40,
                new double[]{20, 20},
                new double[]{40, 60},
                new double[]{80, 40}
        );
        reShape(
                reflectO,
                new double[]{20, 20},
                new double[]{40, 60},
                new double[]{80, 40}
        );
        reShape(
                reflectX,
                new double[]{20, 20},
                new double[]{40, 60},
                new double[]{80, 40}
        );
        reShape(
                reflectY,
                new double[]{20, 20},
                new double[]{40, 60},
                new double[]{80, 40}
        );
    }
}

