package cn.itcast.day04.demo02;
/*
方法其实就是若干语句的功能集合.
方法好比一个工厂.
参数
返回值
完整格式
修饰符 返回类型 方法名称(参数类型 参数名称 , ...){
方法体
return 返回值;
}
 */
public class Demo02MethodDefine {
    public static void main(String[] args) {
        sum(1,2);
        System.out.println("************");
        System.out.println(sum(1, 2));
        System.out.println("************");
        int sum = sum(1, 2);
        System.out.println("sum");
    }
    public static  int sum(int i,int j){
        return i+j;

    }
}
