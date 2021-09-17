package opeartion;

import book.Book;
import book.BookList;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-15
 * Time: 20:39
 */
public class Display implements IOPeration{
    @Override
    public void work(BookList bookList){
        System.out.println("展示图书");
        int size = bookList.getUsedSize();
        for (int i = 0; i < size; i++) {
            Book book = bookList.getPos(i);
            System.out.println(book);
            }

    }


}
