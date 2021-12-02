package bookManager;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-30
 * Time: 21:50
 */
//抽象类可以避免被实例化
abstract public class User {
    private int userId;
    private String name;
    private String password;
    private int isAdmin;

    IOperation[] iOperations;
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }
}
