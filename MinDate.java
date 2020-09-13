public class MinDate {
    public static void main(String[] args) {
        int[] a = new int[5];//创建数组
        int mindate = 100;// 最小的数
        //Math.radom创建一个0~1的浮点数
        a[0] = (int) (Math.random() * 100);
        a[1] = (int) (Math.random() * 100);
        a[2] = (int) (Math.random() * 100);
        a[3] = (int) (Math.random() * 100);
        a[4] = (int) (Math.random() * 100);
        for (int i = 0; i < 5; i++){
            if (a[i]<mindate){
                mindate = a[i];
            }
            System.out.println(a[i]);
        }
        System.out.println("该数组中最小的数是："+mindate);

    }
}
