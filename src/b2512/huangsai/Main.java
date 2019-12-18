package b2512.huangsai;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,4};
        int[] array2 = new int[]{2,1};
        int[] result = Linear.transform(array,array2);
        System.out.println(Arrays.toString(result));
    }
}
