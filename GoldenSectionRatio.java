public class GoldenSectionRatio {
    public static void main(String[] args) {
        float mindiff = 100;
        float result = 0;
        float breakpoint = 0.618f;
        int answerFenzi = 0;//找到的分子
        int answerFenmu = 0;//找到的分母
        for (int fenzi = 1;fenzi<20;fenzi++){
            for (int fenmu = 1;fenmu<20;fenmu++){
                float value = (float)fenzi/fenmu;
                float diff = value - breakpoint;
                diff = diff>0?diff:0-diff;
                if(diff<mindiff){
                    mindiff = diff;
                    answerFenzi = fenzi;
                    answerFenmu = fenmu;
                    result = value;
                }
            }
        }
        System.out.println("距离0.618最近的两个数相除是："+answerFenzi+"/"+answerFenmu);
        System.out.println("最小的差值是："+mindiff);
        System.out.println("相除的结果是："+result);
    }
}
