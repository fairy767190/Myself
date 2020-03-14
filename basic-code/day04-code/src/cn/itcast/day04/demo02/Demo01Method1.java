package cn.itcast.day04.demo02;
/*
定义格式
public static void 方法名称(){

}
调用格式
方法名称();

1.方法的定义先后无所谓
2.方法不可以嵌套
3.方法定义自己不会执行,必须要调用才能执行
 */
public class Demo01Method1 {
    public static void main(String[] args) {
        printMethod();
    }
    public static void printMethod(){
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

