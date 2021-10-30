/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-29
 * Time: 15:52
 */
public class Employee implements Comparable{
    private String name;
    private int age;
    private TestDemo birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public TestDemo getBirthday() {
        return birthday;
    }

    public void setBirthday(TestDemo birthday) {
        this.birthday = birthday;
    }

    public Employee(String name, int age, TestDemo birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    public Employee() {
    }

    @Override
    public int compareTo(Object o){
        if(o instanceof Employee){
            Employee e = (Employee)o;

        }
    }
}
