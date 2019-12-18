package b2512.huangsai;

public class Linear {
    public static int[] transform(int[] array,int[] array2){
        int number = (array2[0] * array[0])+(array2[1] * array[2]);
        int number2 = (array2[0] * array[1])+(array2[1] * array[3]);

        return new int[]{number,number2};
    }
}
