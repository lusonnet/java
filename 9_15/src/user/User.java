package user;

import book.BookList;
import opeartion.IOPeration;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-15
 * Time: 20:47
 */
public abstract class User {
    protected String name;
    protected IOPeration[] ioPerations;
    public User(String name) {
        this.name = name;
    }
    public abstract int menu();//发生动态绑定

    public void doOperation(int choice, BookList bookList){
        this.ioPerations[choice].work(bookList);
    }
}
