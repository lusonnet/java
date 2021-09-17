package opeartion;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-15
 * Time: 20:39
 */
public class Find implements IOPeration{
    public void work(BookList bookList){
        System.out.println("查找图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字：");
        String name = scanner.nextLine();
        int size = bookList.getUsedSize();
        for (int i = 0; i < size; i++) {
            Book book1 = bookList.getPos(i);
            if(book1.getName().equals(name)){
                System.out.println("找到这本书了！");
                System.out.println(book1);
                return;
            }
        }
        System.out.println("没有这本书！");


    }
}
