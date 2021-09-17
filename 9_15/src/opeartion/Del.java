package opeartion;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-15
 * Time: 20:27
 */
public class Del implements IOPeration{
    @Override
    public void work(BookList bookList){
        System.out.println("删除图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字：");
        String name = scanner.nextLine();
        int size = bookList.getUsedSize();
        int pos = -1;
        for (int i = 0; i < size; i++) {
            Book book1 = bookList.getPos(i);
            if(book1.getName().equals(name)){
                pos = i;
                break;
            }
        }
        if(pos!=-1){
            for (int i = pos; i < pos - 1; i++) {
                //
                Book book = bookList.getPos(i+1);
                bookList.setBooks(i,book);
            }
            bookList.setUsedSize(size-1);
            System.out.println("删除成功！");
            return;
        }

    }
}
