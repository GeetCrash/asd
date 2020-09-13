public class Shuixianhua {//水仙花数
    public static void main(String[] args) {
        int a = 1;//百位
        int b = 1;//十位
        int c = 1;//个位
        for (a = 1;a<10;a++){
            for (b = 0;b<10;b++){
                for (c = 0;c<10;c++){
                    if ((a*a*a)+(b*b*b)+(c*c*c)==(a*100)+(b*10)+c){
                        System.out.println((a*100)+(b*10)+c);
                    }
                }
            }
        }
    }
}
