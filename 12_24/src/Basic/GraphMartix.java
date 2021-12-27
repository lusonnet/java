package Basic;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lulu
 * Description:存储地图信息
 * User: Administrator
 * Date: 2021-12-27
 * Time: 11:18
 */
public class GraphMartix {
    public List<Position> vex;//两点权值
    public int[][] arcs;
    public int NodeCount;
    public GraphMartix(List<Position> positions){
        int nodeCount = positions.size();
        NodeCount = nodeCount;
        vex = new ArrayList<>();
        arcs = new int[NodeCount][NodeCount];
        for (int i = 0; i < NodeCount; i++) {
            vex.add(positions.get(i));
            arcs[i][i] = 0;
        }
        //初始化邻接矩阵
        //第一行
        arcs[0][1] = arcs[1][0] = 500;
        arcs[0][2] = arcs[2][0] = 200;
        arcs[0][3] = arcs[3][0] = 999999;
        arcs[0][4] = arcs[4][0] = 999999;
        arcs[0][5] = arcs[5][0] = 999999;
        arcs[0][6] = arcs[6][0] = 999999;
        arcs[0][7] = arcs[7][0] = 999999;
        arcs[0][8] = arcs[8][0] = 999999;
        arcs[0][9] = arcs[9][0] = 999999;

        //第二行
        arcs[1][2] = arcs[2][1] = 50;
        arcs[1][3] = arcs[3][1] = 999999;
        arcs[1][4] = arcs[4][1] = 600;
        arcs[1][5] = arcs[5][1] = 999999;
        arcs[1][6] = arcs[6][1] = 999999;
        arcs[1][7] = arcs[7][1] = 999999;
        arcs[1][8] = arcs[8][1] = 999999;
        arcs[1][9] = arcs[9][1] = 999999;
        //第三行
        arcs[2][3] = arcs[3][2] = 1600;
        arcs[2][4] = arcs[4][2] = 999999;
        arcs[2][5] = arcs[5][2] = 999999;
        arcs[2][6] = arcs[6][2] = 999999;
        arcs[2][7] = arcs[7][2] = 999999;
        arcs[2][8] = arcs[8][2] = 999999;
        arcs[2][9] = arcs[9][2] = 999999;

        //第四行
        arcs[3][4] = arcs[4][3] = 100;
        arcs[3][5] = arcs[5][3] = 999999;
        arcs[3][6] = arcs[6][3] = 300;
        arcs[3][7] = arcs[7][3] = 999999;
        arcs[3][8] = arcs[8][3] = 550;
        arcs[3][9] = arcs[9][3] = 999999;

        //第五行
        arcs[4][5] = arcs[5][4] = 250;
        arcs[4][6] = arcs[6][4] = 200;
        arcs[4][7] = arcs[7][4] = 999999;
        arcs[4][8] = arcs[8][4] = 999999;
        arcs[4][9] = arcs[9][4] = 999999;

        //第六行
        arcs[5][6] = arcs[6][5] = 350;
        arcs[5][7] = arcs[7][5] = 999999;
        arcs[5][8] = arcs[8][5] = 999999;
        arcs[5][9] = arcs[9][5] = 999999;

        arcs[6][7] = arcs[7][6] = 1000;
        arcs[6][8] = arcs[8][6] = 999999;
        arcs[6][9] = arcs[9][6] = 999999;

        arcs[7][8] = arcs[8][7] = 999999;
        arcs[7][9] = arcs[9][7] = 999999;

        arcs[8][9] = arcs[9][8] = 100;
    }

    public GraphMartix(){

    }
}
