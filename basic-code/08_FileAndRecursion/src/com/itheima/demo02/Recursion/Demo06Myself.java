package com.itheima.demo02.Recursion;

import java.io.File;

public class Demo06Myself {
    public static void main(String[] args) {
        File file = new File("C:\\abc");
        getAllFile(file);
    }

    private static void getAllFile(File file) {
        System.out.println(file);

        File[] files = file.listFiles();

        for (File f : files){
            if (f.isDirectory()){
                getAllFile(f);
            }
            else{
                System.out.println(f);
            }
        }
    }

}
