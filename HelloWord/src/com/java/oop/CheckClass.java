package com.java.oop;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class CheckClass {
    public String node1(Scanner s){
        String temp = null;
        String [] thang = {"January","Febulary","March","April","May","June","July","Aug","Sep","Oct","Nov","Dem"};
        System.out.println("User Input : ");
        int a = s.nextInt();
        if (a > 0 && a < 13){
            temp = thang[a-1];
        }
        return temp;
    }
    public void node2(){
        System.out.println("Các số lẻ từ 1 đến 10 là: ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public int node3(Scanner s){
        int temp = 1;
        System.out.println("User Input");
        int a = s.nextInt();
        if (a > 0 && a < 13){
            for (int i = 1 ; i<= a ; i++){
                temp*=i;
            }
        }
        return temp;

    }
    public String node4(Scanner s){
        String temp  = null;
        int count = 0;
        System.out.println("User Input");
        int a = s.nextInt();
        if (a == 2){
            temp+= "Số nguyên tố 2";
        }else{
            for(int i=1; i<=a ;i++ ){
                if (a % i == 0){
                    count++;
                }
                if(count == 2){
                    temp = a+ "không phải số nt";
                    break;
                }
            }
            temp = a + "là số nt";
        }

        return temp;

    }
    public void node5(){
        int temp = 0;
        Integer [] arr = {2,7,4,5,8,3,6,11,23,10};
        System.out.println("vị trí số 11 là "+ Arrays.asList(arr).indexOf(11));
        for (int i = 0 ; i< arr.length;i++){
            if(i%2 == 1 ){
                temp+= arr[i];
            }
        }
        System.out.println("Tổng" + temp);
        Collections.reverse(Arrays.asList(arr));
        System.out.println("magr ngược");
        for (int i= 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }



    }
}
