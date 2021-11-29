import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by lulu
 * Description:JDBC的学习
 * User: Administrator
 * Date: 2021-11-28
 * Time: 17:33
 */
public class Hello {
    public static void main(String[] args) throws SQLException {
        //testInsert();
        testSelect();
    }

    public static void testSelect() throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/javaclass");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("52zxc,123");
        Connection connection = dataSource.getConnection();
        String sql = "select * from student";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        //遍历结果集合
        while(resultSet.next()){
            //获取到一行的每一个列
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            System.out.println(id +" "+name);
        }
        resultSet.close();
        statement.close();
        connection.close();

    }

    public static void testdelete() throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/javaclass");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("52zxc,123");
        Connection connection = dataSource.getConnection();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的Id");
        int id = scanner.nextInt();
        String sql = "delete from student where id = 1";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,id);
        int ret = statement.executeUpdate();
        System.out.println(ret);
        statement.close();
        connection.close();
    }

    public static void testInsert() throws SQLException {
        //1.创建一个数据源对象
        DataSource dataSource = new MysqlDataSource();
        //2.把数据库的位置信息，设置到DataSource中
        //     (1)把数据库的IP端口、数据名、通过一个URL来表示
        //        使用setURL方法，该方法属于MysqlDataSource
        //        需要向下转型
        //        (使用该方法的好处体现在代码中其他部分拿到的dataSource类型和具体的数据库种类无关，如果需要更换数据库，其他代码就不需要更换了)
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/javaclass");
        /**
         * 不使用向下转型的方法：
         * MysqlDataSource dataSource = new MysqlDataSource();
         * dataSource.setURL(".....");
         *
         * 该方法蛇使得其他其他部分的代码拿到的dataSource都是MysqlDataSource类型的，
         * 如果要更换数据库，需要将这里的dataSource的类型进行调整
         *
         * 根据需求选择方法
         */
        //     (2)设置登录数据库的用户名
        ((MysqlDataSource)dataSource).setUser("root");
        //     (3)设置登录数据库的密码
        ((MysqlDataSource)dataSource).setPassword("52zxc,123");
        //3.建立连接
        Connection connection = dataSource.getConnection();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入id");
        int id = scanner.nextInt();
        System.out.println("请输入姓名");
        String name = scanner.next();
        //4.构造SQL语句，为插入做准备
        String sql = "insert into student values(?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,id);//替换占位符
        statement.setString(2,name);//替换占位符
        //5.执行SQL
        //  客户端把SQL通过网络请求，发送给mysql服务器
        //  mysql服务器来解析这个SQL请求，执行具体操作，返回响应结果。
        //  使用executeUpdate来完成数据库内容的变更(增删改查)
        //  返回值就是这个操作影响到的行数
        int ret = statement.executeUpdate();
        System.out.println(ret);

        //6.回收资源
        statement.close();
        connection.close();
    }
}
