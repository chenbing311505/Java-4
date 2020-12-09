package cn.itcast.experiment.four;

import cn.itcast.experiment.three.Student;
import sun.security.mscapi.CPublicKey;
import java.util.InputMismatchException;
import java.util.HashSet;
import java.util.Scanner;
//记得明天加HashSet弄列表
//用switch来弄各个功能做各个函数
public class Test {
    public static void main(String[] args) {

        int fee=0;
        int salary=0;
        boolean bool = true;
        boolean bool1 = true;
        HashSet<DoctoralCandidate> names = new HashSet<DoctoralCandidate>();

        DoctoralCandidate dc_1 = new DoctoralCandidate("陈冰", "男", 21, 5000, 6000);
        DoctoralCandidate dc_2 = new DoctoralCandidate("小明", "男", 19, 4000, 5000);

        System.out.println(dc_1.getSalary());
        System.out.println(dc_1.getTuitionFee());

        //定义DdctoralCandidate数组
        DoctoralCandidate[] s1 = {dc_1, dc_2};
        for (DoctoralCandidate str : s1) {
            System.out.println("你好，" + str.getName()+"欢迎来到管理系统!");
            System.out.println("--------------------------------------------------");
            //获取作为学生的学费
            Scanner x = new Scanner(System.in);
            System.out.println("请输入你的学费:");
            System.out.println("--------------------------------------------------");
            //利用数组输入
//            Scanner in = new Scanner(System.in);
//            String a[]=new String[2];
//            for (int i = 0; i <a.length ; i++) {
//                a[i]=in.next();
//
//
//            }
            while (bool) {
                try {
                    fee = x.nextInt();
                    bool=false;


                } catch (InputMismatchException e) {
                    x.nextLine();
                    System.out.println("输入格式错误2223");

                    //continue;

                }
                //break;

            }
            bool=true;
//            System.out.println("///");
//            System.out.println(fee);
            //int fee = x.nextInt();
            //设置作为学生的学费
            str.setTuitionFee(fee);
            //获取作为助教的工资
            System.out.println("请输入你的每月的薪水:");
            while (bool1) {
                try {
                    salary = x.nextInt();
                    bool1=false;


                } catch (InputMismatchException e) {
                    x.nextLine();
                    System.out.println("输入格式错误2223");

                    //continue;

                }
                //break;

            }
            bool1=true;

            //设置作为助教的工资
            str.setInquire(salary);
            //计算年收入和学费的差值
            str.calculate();
//            System.out.println("8/////");
//            System.out.println(str.calculate());
            //设置旗帜来判断年收入和学费的关系
            boolean flag = str.isMark();
            System.out.println(flag);
            CalculationIncomeTax ca= new CalculationIncomeTax();
            ca.C(str);
            names.add(str);
            System.out.println("您的年个人所得为："+str.getIndividualIncomeTax()+"元");
            System.out.println(str);
        }
        System.out.println("列表");
        for (Object object : names) {
            System.out.println(object);
        }
    }
//    public void show(){
//        fee = x.nextInt();
//    }
}
