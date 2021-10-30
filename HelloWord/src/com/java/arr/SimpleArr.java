package com.java.arr;

import java.util.Scanner;

public class SimpleArr {
    public static void main(String[] args) {
        int nhap;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("input lenght arr ");
        int len = sc.nextInt();

        int [] stu = new int[len];
        String [] stuName = new String[len];
        for (int i = 0 ; i < stu.length; i++){
            System.out.print(" input fot " + i + " ");
            nhap = sc.nextInt();
            System.out.println(" Input for name " + i + " ");
            name = sc.next();
            stu[i] = nhap;
            stuName[i] = name;
        }
        System.out.println("Check id name : ");
        int userInput = sc.nextInt();
        for (int i : stu){
            if (userInput == i){
                System.out.println("your namee is "+ stuName[i] );
            }

        }





    }
}
