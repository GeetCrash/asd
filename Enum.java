public class Enum {
    public enum enumTest {
        TANK,WIZARD,ASSASSIN,ASSIST,WARRIOR,RANGED,PUSH,FARMING;

        public static void main(String[] args){
            for (enumTest value : enumTest.values()){
                switch (value){
                    case TANK:System.out.println("坦克");break;
                    case WIZARD:System.out.println("法师");break;
                    case ASSASSIN:System.out.println("刺客");break;
                    case ASSIST:System.out.println("辅助");break;
                    case WARRIOR:System.out.println("近战");break;
                    case RANGED:System.out.println("远程");break;
                    case PUSH:System.out.println("推进");break;
                    case FARMING:System.out.println("打野");break;
                    default:System.out.println("Nothing!");
                }
            }
        }
    }
}
