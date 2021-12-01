package bookManager;

import com.mysql.jdbc.ConnectionFeatureNotAvailableException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lulu
 * Description:负责Book的增删查改（封装）
 * User: Administrator
 * Date: 2021-11-30
 * Time: 23:29
 */
public class BookDAO {
    public static void add(Book book){
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            //1.建立数据库
            connection = DBUtil.getConnection();
            //2.构造SQL
            String sql = "insert into book values(null,?,?,?,?,0)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,book.getName());
            statement.setString(2, book.getAuthor());
            statement.setInt(3,book.getPrice());
            statement.setString(4,book.getType());
            //3.SQL
            int ret = statement.executeUpdate();
            if(ret!=1){
                System.out.println("增加失败");
            }else{
                System.out.println("增加成功");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBUtil.close(connection,statement,null);
        }
    }
    public static List<Book> find(){
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Book> books = new ArrayList<>();
        try{
            connection = DBUtil.getConnection();
            String sql = "select * from book";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while(resultSet.next()){
                Book book = new Book();
                book.setBookId(resultSet.getInt("bookId"));
                book.setName(resultSet.getString("name"));//读到Book里面
                book.setAuthor(resultSet.getString("author"));
                book.setPrice(resultSet.getInt("price"));
                book.setType(resultSet.getString("type"));
                book.setBorrowed(resultSet.getInt("isBorrowed")==1);//参数是boolean类型
                books.add(book);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBUtil.close(connection,statement,resultSet);
        }
        return books;
    }

    //按书名寻找
    public static List<Book> findbookByname(String name){
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Book> books = new ArrayList<>();
        try{
            connection = DBUtil.getConnection();
            String sql = "select * from book where name = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1,name);
            resultSet = statement.executeQuery();
            while(resultSet.next()){
                Book book = new Book();
                book.setBookId(resultSet.getInt("bookId"));
                book.setName(resultSet.getString("name"));//读到Book里面
                book.setAuthor(resultSet.getString("author"));
                book.setPrice(resultSet.getInt("price"));
                book.setType(resultSet.getString("type"));
                book.setBorrowed(resultSet.getInt("isBorrowed")==1);//参数是boolean类型
                books.add(book);
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBUtil.close(connection,statement,resultSet);
        }
        return books;
    }

    //按ID删除
    public static boolean delete(int bookId){
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            connection = DBUtil.getConnection();
            String sql = "delete from book where bookId = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,bookId);
            int ret = statement.executeUpdate();
            if(ret!=1){
                return false;
            }
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBUtil.close(connection,statement,null);
        }
        return false;
    }

    //借书 1已借出
    //考虑多借出的情况
    //考虑：需要先判定书是不是借出，未借出，再执行借出操作。
    public static boolean borrowBook(int bookId){
        Connection connection = null;
        PreparedStatement statement = null;//
        PreparedStatement statement1 = null;//避免溢出
        ResultSet resultSet = null;
        try{
            connection = DBUtil.getConnection();
            String sql = "select * from book where bookId = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,bookId);
            resultSet = statement.executeQuery();
            if (resultSet.next()){
                boolean isBorrowed = (resultSet.getInt("isBorrowed")==1);
                if(isBorrowed){
                    System.out.println("书已经被借出来了！bookId = "+bookId);
                    return false;
                }
            }else{
                System.out.println("书不存在！bookId = "+bookId);
                //已经被借出
                return false;
            }
            //判定完毕，执行SQL语句
            sql = "updata book set isBorrowed = 1 where bookId = ?";
            statement1 = connection.prepareStatement(sql);
            statement1.setInt(1,bookId);
            int ret = statement1.executeUpdate();
            if(ret!=1){
                System.out.println("无法修改借出状态 bookId = "+ bookId);
                return false;
            }
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            //DBUtil.close(connection,statement,resultSet);
            if(resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(statement1!=null){
                try {
                    statement1.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return false;
    }


    //还书
    public static boolean returnBook(int bookId){
        Connection connection = null;
        PreparedStatement statement = null;//
        PreparedStatement statement1 = null;//避免溢出
        ResultSet resultSet = null;
        try{
            connection = DBUtil.getConnection();
            String sql = "select * from book where bookId = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,bookId);
            resultSet = statement.executeQuery();
            if (resultSet.next()){
                boolean isBorrowed = (resultSet.getInt("isBorrowed")==1);
                if(!isBorrowed){
                    System.out.println("书已经被归还了！bookId = "+bookId);
                    return false;
                }
            }else{
                System.out.println("书不存在！bookId = "+bookId);
                //已经被借出
                return false;
            }
            //判定完毕，执行SQL语句
            sql = "updata book set isBorrowed = 0 where bookId = ?";
            statement1 = connection.prepareStatement(sql);
            statement1.setInt(1,bookId);
            int ret = statement1.executeUpdate();
            if(ret!=1){
                System.out.println("无法修改归还状态 bookId = "+ bookId);
                return false;
            }
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            //DBUtil.close(connection,statement,resultSet);
            if(resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(statement1!=null){
                try {
                    statement1.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return false;


    }
}
