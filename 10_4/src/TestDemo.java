import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-04
 * Time: 15:48
 */

class Student implements Comparable<Student>{
    private String name;
    private String classes;
    private int score;

    public Student(String name, String classes, int score) {
        this.name = name;
        this.classes = classes;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student stu){
        return this.getScore()-stu.getScore();
    }

}


public class TestDemo {

    public static void main(String[] args) {

    }
    public static void func(String str1,String str2){
        List<Character> ret = new ArrayList<>();

        for(int i = 0;i < str1.length();i++){
            char ch = str1.charAt(i);
            if(!str2.contains(ch+"")){
                ret.add(ch);
            }
        }
        for (char ch:ret) {
            System.out.print(ch);
        }
    }
    public static void main3(String[] args) {
        func("welcome","come");

    }
    public static void main2(String[] args) {
        ArrayList<Student>list = new ArrayList<>();
        /*list1.add(10);
        list1.add(2);
        list1.add(6);*/
        list.add(new Student("lulu","1",100));
        list.add(new Student("asd","2",10));
        list.add(new Student("ces","1",60));

        Collections.sort(list);
        for (Student s:list) {
            System.out.println(s);
        }
    }
    public static void main1(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("lulu","1",100));
        list.add(new Student("asd","2",10));
        list.add(new Student("ces","1",60));
        //System.out.println(list);
        for (Student s:list) {
            System.out.println(s);
        }
    }
}
