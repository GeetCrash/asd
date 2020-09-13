public class Arrays {
    public static void main(String[] args) {
        int[] a = {(int) (Math.random()*100),(int) (Math.random()*100),(int) (Math.random()*100),(int) (Math.random()*100),(int) (Math.random()*100)};
        for (int i = 0; i < 5; i++){
            System.out.println(a[i]);
        }
        for (int i = 0; i < 5/2; i++){
            int temp;//中间值
            temp = a[i];
            a[i] = a[4-i];
            a[4-i] = temp;
        }
        System.out.println("数组反转");
        for (int i = 0; i < 5; i++){
            System.out.println(a[i]);
        }
    }
}
