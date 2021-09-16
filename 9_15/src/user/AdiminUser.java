package user;

import opeartion.*;

import java.util.Scanner;

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
        this.ioPerations = new IOPeration[]{
                new Exit(),
                new Find(),
                new Add(),
                new Del(),
                new Display()
        };
    }

    public int menu(){
        System.out.println("===========管理员菜单===========");
        System.out.println("hello " + this.name + " 欢迎光临");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}