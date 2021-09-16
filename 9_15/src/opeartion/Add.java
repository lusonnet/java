package opeartion;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-15
 * Time: 20:25
 */
public class Add implements IOPeration{
    @Override
    public void work(BookList bookList){
        System.out.println("新增图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字：");
        String name = scanner.nextLine();
        System.out.println("请输入图书的作者：");
        String author = scanner.nextLine();
        System.out.println("请输入图书的类型：");
        String type = scanner.nextLine();
        System.out.println("请输入价格：");
        int price = scanner.nextInt();
        Book book = new Book(name,author,price,type);
        int size = bookList.getUsedSize();
        for (int i = 0; i < size; i++) {
            Book book1 = bookList.getPos(i);
            if(book1.getName().equals(name)){
                System.out.println("已经存在这本书了！");
                return;
            }
        }
        bookList.setBooks(size,book);
        bookList.setUsedSize(size+1);
        System.out.println("已添加！");

    }
}
