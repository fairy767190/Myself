package com.wangyuqi;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length ; i++) {

            for (int j = 0; j < chars.length; j++) {


                if (chars[i] != chars[j]) {
                    System.out.println(chars[i] + "" + ',' + chars[j] + "");

                }
            }
        }


    }
}
