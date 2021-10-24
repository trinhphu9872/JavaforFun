package com.project.game;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome to wonderland");
        System.out.println("may i have your name");
        Scanner scam = new Scanner(System.in);

        String Name = scam.next();
        System.out.println("Hello " + Name);

        System.out.println("Shall we start ? ");
        System.out.println("\t1 Yes");
        System.out.println("\t2 No");

        int intAns = scam.nextInt();

        while (intAns != 1){
            System.out.println("Shall we start ? ");
            System.out.println("\t1 Yes");
            System.out.println("\t2 No");

            intAns = scam.nextInt();
        }

        Random rd = new Random();
        int x = rd.nextInt(20) + 1;
        System.out.println("Get number ");
        int userInput = scam.nextInt();

        int timeStart = 0;
        boolean checkCode = false;
        boolean shouldone = false;

        while (!shouldone){
            timeStart ++ ;
            if (timeStart < 5){
                if (userInput == x ){
                    shouldone = true;
                    checkCode = true;
                }else if(userInput > x){
                    System.out.println("Smaill < x");
                    userInput = scam.nextInt();
                }else{
                    System.out.println("large >x");
                    userInput= scam.nextInt();
                }
            }
            else {
                shouldone = true;
            }
        }
        if (checkCode == true){
            System.out.println("Congratoration to ending code");
        }else {
            System.out.println("you lose and ans is " + x);
        }


    }
}
