public class Shuixianhua2 {
    public static void main(String[] args) {
        int ge;//个位数
        int shi;//十位数
        int bai;//百位数
        for (int x = 100;x<1000;x++){
            bai = x/100;
            shi = (x/10)%10;
            ge = x%10;
            if(x == ge*ge*ge+shi*shi*shi+bai*bai*bai){
                System.out.println(x);
            }
        }
    }
}
