package bookManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by lulu
 * Description:负责Book的增删查改
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
}
