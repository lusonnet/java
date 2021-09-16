package opeartion;

import book.BookList;

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
    }
}
