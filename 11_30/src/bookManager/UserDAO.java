package bookManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-12-01
 * Time: 23:54
 */
public class UserDAO {
    public User findByName(String name){
        Connection collection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            collection = DBUtil.getConnection();
            String sql = "select * from user where name = ?";
            statement = collection.prepareStatement(sql);
            statement.setString(1,name);
            resultSet = statement.executeQuery();
            if(resultSet.next()){
                boolean isAdmin = (resultSet.getInt("isAdmin")==1);
                User user = null;
                //此处不能直接new User,应该根据isAdmin值来决定new一个Admin还是NormalUser
                if(isAdmin){
                    user = new Admin();//1--管理员
                }else{
                    user = new NormalUser();
                }
                user.setUserId(resultSet.getInt("userId"));
                user.setName(resultSet.getString("name"));
                user.setPassword(resultSet.getString("password"));
                return user;
            }
            return null;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBUtil.close(collection,statement,resultSet);
        }
        return null;

    }


}
