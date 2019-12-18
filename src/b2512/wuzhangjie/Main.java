package b2512.wuzhangjie;

public class Main {

    public static int[] str(int[] xy,int[] xy1){
        int x = (xy[0] * xy1[0]) + (xy[1] * xy1[1]);
        int y = (xy[2] * xy1[0]) + (xy[3] * xy1[1]);
        return new int[]{x,y};
    }
    public static void main(String[] args) {
        // write your code here
        var pic = str(new int[]{2,4,5,1},new int[]{1,2});
        for (int i=0;i<pic.length;i++){
            System.out.println(pic[i]);
        }
    }
}

