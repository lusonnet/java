package bookManager;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by lulu
 * Description: 该类把数据库的连接操作封装一下。
 * User: Administrator
 * Date: 2021-11-30
 * Time: 22:13
 */
public class DBUtil {
    private static String url = "jdbc:mysql://127.0.0.1:3306/java101bookmanager";
    private static String username = "root";
    private static String password = "52zxc,123";

    //DataSource在类里面只有一份，用static修饰可以使它成为类成员(JVM在加载一个类的时候，
    //会先查看类是不是已经在内存中存在了，如果存在，就不需要重复加载，如果不存在，就会从
    //.class里面加载。

    // 确保有唯一实例(单例模式)
    private static DataSource dataSource = new MysqlDataSource();

    //用到这个类就会加载静态代码块
    static {
        ((MysqlDataSource)dataSource).setURL(url);
        ((MysqlDataSource)dataSource).setUser(username);
        ((MysqlDataSource)dataSource).setPassword(password);
    }

    //与数据库建立连接
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    //关闭资源
    public static void close(Connection connection, PreparedStatement statement, ResultSet resultSet){
        if(resultSet!=null){
            try {
                resultSet.close();
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
}
