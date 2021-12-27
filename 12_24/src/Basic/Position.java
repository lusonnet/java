package Basic;

/**
 * Created by lulu
 * Description:每个建筑物的信息：编号、名称、功能
 * User: Administrator
 * Date: 2021-12-27
 * Time: 11:18
 */
public class Position {
    int id;//地标ID
    String name;//地标名
    String intro;//地标介绍

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }


}
