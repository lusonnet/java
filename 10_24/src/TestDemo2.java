/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-25
 * Time: 22:35
 */
public class TestDemo2 {

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
