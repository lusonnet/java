/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-24
 * Time: 17:06
 */
public class GreekAlphabet {
    public static void main(String args[]){
        int z=(byte)128;
        int startPosition=0,endPosition=0;
        char cStart='α',cEnd='ω';
        startPosition=cStart;
        endPosition=cEnd;
        System.out.println(z);
        System.out.println("希腊字母\'α\'在unicode表中的顺序位置:"+(int)cStart);
        System.out.println("希腊字母表：");
        for(int i=startPosition;i<=endPosition;i++){
            char c='\0';
            c = (char) i;
            System.out.print(""+c);
            if((i-startPosition+1)%10==0)
                System.out.println("");
        }

    }
}
