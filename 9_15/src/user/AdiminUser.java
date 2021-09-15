package user;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-15
 * Time: 20:51
 */
public class AdiminUser extends User{
    public AdiminUser(String name) {
        super(name);
    }

    public void menu(){
        System.out.println("===========管理员菜单===========");
        System.out.println("hello " + this.name + "欢迎光临");
        System.out.println("1.查找图书");
    }
}