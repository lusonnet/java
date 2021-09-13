package com.bit.demo1;

import com.bit.extenddemo.Test2;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-11
 * Time: 16:36
 */
public class TestDemo extends Test2 {
    public void func(){
        Test2 test2 = new Test2();
        System.out.println(super.size);
        //System.out.println(test2.size);//错误！
    }


}
