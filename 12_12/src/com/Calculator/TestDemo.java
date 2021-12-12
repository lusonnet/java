package com.Calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-12-12
 * Time: 21:56
 */
public class TestDemo {
    public static void main(String[] args) {
        new Calculator();
    }
}

class Calculator extends Frame {
    public Calculator(){
        //文本框
        TextField num1 = new TextField(10);
        TextField num2 = new TextField(10);
        TextField num3 = new TextField(20);

        Button button = new Button("=");
        button.addActionListener(new MyCalculatorListener(num1,num2,num3));

        Label label = new Label("+");
        setLayout(new FlowLayout());//布局
        add(num1);
        add(label);
        add(num2);
        add(num3);

        pack();
        setResizable(true);

    }
}

//监听器
class MyCalculatorListener implements ActionListener{
    //获取三个变量
    private TextField num1,num2,num3;
    public MyCalculatorListener(TextField num1,TextField num2,TextField num3){
        this.num1 = num1;
        this.num3 = num3;
        this.num2 = num2;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //1.获得被加数和加数
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());

        //2.将这个值加法运算后放到第三个框
        num3.setText(""+(n1+n2));
        //3.清除前两个框
        num1.setText("");
        num2.setText("");
    }
}
