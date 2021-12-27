package Utils;

import Basic.Dist;
import Basic.GraphMartix;
import Basic.Position;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lulu
 * Description:计算某两点间的最短信息，利用Dijkstra算法
 * User: Administrator
 * Date: 2021-12-27
 * Time: 11:23
 */
public class PathCalculator {
    public List<Dist> Dijkstra(GraphMartix graphMartix,int start,int end){
        List<Dist> dists = new ArrayList<>();
        //初始化dist数组
        for (int i = 0; i < graphMartix.NodeCount; i++) {
            Dist tempDist = new Dist();
            tempDist.setSpot(i);
            tempDist.setPreSpot(start);
            tempDist.setWeight(graphMartix.arcs[start][i]);
            dists.add(tempDist);
        }
        /**
         *使用Dijkstra算法
         */

        //提供一个selectedPosition数组，加入那些使Dist数组不断变化的结点
        List<Position> selectedPositions = new ArrayList<>();
        //加入起点
        selectedPositions.add(graphMartix.vex.get(start));
        //之前用顶点表对应的邻接矩阵初始化了Dist数组，现在Dist数组长度就是顶点表长度
        while(selectedPositions.size() < dists.size()){
            //每次寻找最小权，都将min和minweight做一个初始化
            int min = 0;
            int minweight = 999999;
            //遍历寻找Dist数组，找到最小权
            for (int i = 0; i < dists.size(); i++) {
                /**
                 * 限制条件为：
                 * 当该点的权值小于最小权且不在selectPostion数组中
                 * 将其选作下一个待加入的selectedPosition集合的元素
                 * 方法为改变min的下标
                 */

            }
        }
        return dists;
    }
}
