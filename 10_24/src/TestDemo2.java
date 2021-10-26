/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-25
 * Time: 22:35
 */
public class TestDemo2 {
    public static void main(String[] args) {
        Season2 summer = Season2.SUMMER;
        //System.out.println(summer);
        System.out.println(summer.toString());
        System.out.println("-------------------");
        Season2[] values = Season2.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            values[i].show();
        }
        /*for (Season2 i:values) {
            System.out.println(i);
            i.show;
        }*/

        /*Thread.State[] values1 = Thread.State.values();
        for (Thread.State i:values1) {
            System.out.println(i);
        }*/

        Season2 summer1 = Season2.valueOf("SUMMER");
        System.out.println(summer1);
    }
}

interface Info{
    void show();
}

enum Season2 implements Info{
    SPRING("春天","春暖花开"){
        public void show(){
            System.out.println("春天在哪里");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        public void show(){
            System.out.println("宁夏");
        }
    },

    AUTUMN("秋天","秋高气爽"){
        public void show(){
            System.out.println("秋天");
        }
    };

    private final String seasonName;
    private final String seasonDesc;
    //私有化类的构造器
    private Season2(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //提供ToString
    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

}
class Season{
    //申明Season对象的属性：private final修饰
    private final String seasonName;
    private final String seasonDesc;
    //私有化类的构造器
    private Season(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //提供当前枚举类的多个对象：public static final
    public static final Season Spring = new Season("春天","春暖花开");
    public static final Season Summer = new Season("夏天","夏日");

    //获取枚举类的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //提供ToString
    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
