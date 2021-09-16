import book.BookList;
import user.AdiminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-16
 * Time: 20:45
 */
public class Main {
    public static User login(){//发生向上转型l
        System.out.println("请输入姓名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("1.管理员      2.用户");
        int choice = scanner.nextInt();
        if(choice == 1){
            return new AdiminUser(name);
        }else{
            return new NormalUser(name);
        }
    }
    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();
        while (true) {
            int choice = user.menu();
            user.doOperation(choice, bookList);

        }
    }
}
