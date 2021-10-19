import java.util.*;
/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-19
 * Time: 23:05
 */
public class TestDemo4 {
    public static void main(String args[]) {
        List t = new LinkedList();
        t.add(new Name("Karl", "M"));
        t.add(new Name("John", "O"));
        t.add(new Name("Tom", "M"));
        System.out.println(t);
        Collections.sort(t);
        System.out.println(t);
    }
}

class Name implements Comparable{
    String firstName, lastName;
    Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public int compareTo(Object o) {
        Name n = (Name)o;
        int lastCmp = lastName.compareTo(n.lastName);
        return
                (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));
    }
}
