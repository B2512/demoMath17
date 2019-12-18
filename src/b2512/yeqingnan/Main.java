package b2512.yeqingnan;

import java.util.Arrays;

public class Main {
    public static int[] data1 = {2, 4, 5, 1};

    public static int[] line(int[] data1, int[] data2) {
        int x = data1[0] * data2[0] + data1[2] * data2[1];
        int y = data1[1] * data2[0] + data1[3] * data2[1];
        return new int[]{x,y};
    }

    public static void main(String[] args) {
        int[] newdata = line(data1,new int[]{1,2});
        System.out.println(Arrays.toString(newdata));
    }
}
