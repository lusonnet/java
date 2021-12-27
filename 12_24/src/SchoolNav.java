import Basic.Dist;
import Basic.GraphMartix;
import Basic.Position;
import Utils.PathCalculator;
import Utils.PositionIniter;

import java.util.List;
import java.util.Scanner;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-12-27
 * Time: 10:49
 */
public class SchoolNav {
    public static void main(String[] args) {
        PositionIniter psit = new PositionIniter();
        List<Position> positions = psit.initPos();
        GraphMartix graphMartix = new GraphMartix(positions);
        PathCalculator pclr = new PathCalculator();
        //List<Dist> dists = pclr.Dijkstra(graphMartix,3,0);//测试使用
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int start = 0;
        int end = 0;
        while(true){
            System.out.println("=========欢迎使用西安邮电大学校园导游系统==============");
            System.out.println("             1.查询所有地点");
            System.out.println("             2.输入地点名称查询信息");
            System.out.println("             3.查询两点所有路径");
            System.out.println("             4.查询两点最短路径");
            System.out.println("             5.查询两点最佳路径");
            System.out.println("             0.退出系统");
            System.out.println("=================================================");
            System.out.println("请选择序号：");
            choice = scanner.nextInt();
            switch (choice){
                case 0:
                    System.out.println("欢迎再次使用本校园导航系统");
                    return;
                case 1:
                    getAllPosition(graphMartix);
                    break;
                case 2:
                    getInfo(graphMartix);
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("请输入起点：");
                    String from = scanner.next();
                    System.out.println("请输入终点");
                    String to = scanner.next();
                    start = convert(graphMartix,from);//此函数名称转ID
                    end = convert(graphMartix,to);
                    pclr.Dijkstra(graphMartix,start,end);

                case 5:
                    break;
            }
        }
    }
    public static void getAllPosition(GraphMartix graphMartix){
        System.out.println("所有地点的信息如下：");
        for (int i = 0; i < graphMartix.vex.size(); i++) {
            Position temp = graphMartix.vex.get(i);
            System.out.println("ID: " + temp.getId());
            System.out.println("名称: " + temp.getName());
            System.out.println("介绍: " + temp.getIntro());
        }
        return;
    }

    public static void getInfo(GraphMartix graphMartix){
        String Name = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要查询的地点：");
        Name = scanner.next();
        int mark = 0;
        Position temp = new Position();
        for (int i = 0; i < graphMartix.vex.size(); i++) {
            temp = graphMartix.vex.get(i);
            if(temp.getName().equals(Name)){//判断是否相等
                mark = 1;
                break;
            }
        }
        if(mark == 1){//查找地点存在
            System.out.println("您查找的地点是："+temp.getName());
            System.out.println("ID:"+temp.getId());
            System.out.println("名称："+temp.getName());
            System.out.println("介绍："+temp.getIntro());
            return;
        }else{
            System.out.println("未找到指定地点，请重新输入");
            System.out.println("您的输入树："+ Name);
            return;
        }
    }

    //将名称转换为编号
    public static int convert(GraphMartix graphMartix,String Name){
        Position temp = new Position();
        for (int i = 0; i < graphMartix.vex.size(); i++) {
            temp = graphMartix.vex.get(i);
            if(temp.getName().equals(Name)){
                return i;
            }
        }
        return -1;
    }
}

















