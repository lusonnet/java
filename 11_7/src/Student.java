/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-07
 * Time: 12:30
 */


public class Student {
    //私有属性
      private String name = "Tom";
      //公有属性
      public int age = 18;
      //构造方法
      public Student() {

      }
     //私有方法
     private void say(){
          System.out.println("private say()...");
      }
     //公有方法
     public void work(){
          System.out.println("public work()...");
      }
}
