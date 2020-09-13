import java.util.Scanner;
public class Paixu {
    public static void main(String[] args) {
        int[] a = {(int) (Math.random()*100),(int) (Math.random()*100),(int) (Math.random()*100),(int) (Math.random()*100),(int) (Math.random()*100)};
        for (int i = 0; i < 5; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("输入1从小到大排序（选择），输入2从大到小（冒泡）");
        //（从小到大）选择排序
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        switch (b){
            case 1:
                for (int j = 0; j < a.length-1; j++){
                    for (int i = j+1; i < a.length; i++){
                        if(a[i] < a[j]){
                            int temp = a[j];
                            a[j] = a[i];
                            a[i] = temp;
                        }
                    }
                }
                for (int i = 0; i < 5; i++){
                    System.out.print(a[i]+" ");
                }
                break;
            case 2:
                for (int j = 0; j < a.length; j++){
                    for (int i = 0; i < a.length-j-1; i++){
                        if(a[i] < a[i+1]){
                            int temp = a[i];
                            a[i] = a[i+1];
                            a[i+1] = temp;
                        }
                    }
                }
                for (int i = 0; i < 5; i++){
                    System.out.print(a[i]+" ");
                }
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
