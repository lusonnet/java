package user;

import opeartion.*;

import java.util.Scanner;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-15
 * Time: 20:49
 */
public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
        this.ioPerations = new IOPeration[]{
                new Exit(),
                new Find(),
                new Borrow(),
                new Return(),
                new Display()
        };

    }

    public int menu(){
        System.out.println("===========用户菜单===========");
        System.out.println("hello " + this.name + " 欢迎光临");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;

    }
}
