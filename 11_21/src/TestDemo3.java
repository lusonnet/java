/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-21
 * Time: 19:26
 */
/*public class TestDemo3 {

}*/
//--------------------Main.java
 class Student {
    private String name;
    private double score;

    public  String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getScore(){
        return score;
    }

    public void setScore(double score){
        this.score =score;
    }



    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String  toString( ){
        return  name + "--" +score ;
    }

}

public class TestDemo3 {
    public static void main(String args[])    {
        String []name = {"Tom","Jim","Apple","Rose","Jack"    ,"Lucy"};
        double [] score = {98,76,85,66,72,0};

        Student [] sGroup = new Student[ name.length ];

        for( int i = 0 ; i < sGroup.length ; i++)
            sGroup[i] = new Student (name[i], score[i]);

        System.out.println("Student");
        for( int i = 0 ; i < sGroup.length ; i++)
            System.out.println(sGroup[i]);

        System.out.println("end");
    }
}
