import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        /*int[] a = {12,23,34,123,23};
        int MAX = 0;
        for(int b : a){//增强型for循环
            System.out.print(b+" ");
            if(b > MAX){
                MAX = b;
            }
        }
        System.out.print("\n");
        System.out.println(MAX);*/
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a+b);*/
        int[][] a = new int[5][5];//5*5的二维数组
        int count = 1;
        int max = 0;
        int line = 0;
        int row = 0;
        for (int i = 0; i < 5; i++){
            for (int j =0; j < 5; j++){
                a[i][j] = (int)(Math.random()*100);
                /*System.out.print(a[i][j]+" ");
                if(0 == count%5){
                    System.out.println();
                }
                count++;*/
                if (a[i][j] > max){
                    max = a[i][j];
                    line = i;
                    row =j;
                }
            }
        }
        for (int[] each: a){
            System.out.println(Arrays.toString(each));}
        System.out.println("最大的数："+max);
        System.out.println("行："+(line+1)+"列："+(row+1));
    }
}
