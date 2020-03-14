package cn.itcast.day04.demo03;

import java.util.ArrayList;
import java.util.Random;

public class Demo01ArrayListReturn {
    public static void main(String[] args) {
        getArrayList();




        char chr = 'A';
        System.out.println(chr+1);
        byte[] bt = {97,98,99};
        String str = new String(bt);
        System.out.println(str);

    }

    private static void getArrayList() {
        ArrayList<Integer> bigList = new ArrayList<>();
        ArrayList<Integer> smallList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int ri = random.nextInt(100);
             bigList.add(ri);
        }
        for (int i = 0; i < bigList.size(); i++) {
            if(bigList.get(i) % 2 == 0){
                smallList.add(bigList.get(i));
            }

        }
        System.out.println(smallList);
    }
}
