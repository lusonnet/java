package Utils;

import Basic.Position;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-12-27
 * Time: 11:23
 */
public class PositionIniter {
    int NodeCount = 10;
    String[] posName = {"体育馆","图书馆","美食广场","旭日大酒店","医务室","大学生活动中心",
    "东升苑","逸夫楼","安美南","京东快递点"};
    String[] posIntro = {"锻炼身体","自习阅读，提高自己","美味实惠，价格便宜","装修高档，菜式多样",
            "看病买药，价格便宜","提高身心素养，拓展视野","东区学子的天堂，健康又卫生","上课自习，应有尽有"
            ,"女生宿舍，休养生息","京东快递点，东区的骄傲"};
    int[] numbers = {1,2,3,4,5,6,7,8,9,10};//地点编号
    public List<Position> initPos(){//初始地点
        List<Position> positions = new ArrayList<>();
        for (int i = 0; i < NodeCount; i++) {
            Position position = new Position();
            position.setId(numbers[i]);
            position.setName(posName[i]);
            position.setIntro(posIntro[i]);
            positions.add(position);
        }
        return positions;
    }
}
