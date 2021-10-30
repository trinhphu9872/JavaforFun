package com.challange.done;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Paitent paitent = new Paitent("Trịnh Phú", 20,
                new Eye("Left Eyes", "Short", "Red",true),
                new Eye("Right Eye" , "Normal", "Blue",true),
                new Heart("Heart", "Normal",64),
                new Stomach("Stomach", "Pub", false),
                new Skin("Skin", "Burned", "White", 40)
                );
        System.out.println("My Name is : " + paitent.getName());
        System.out.println("Old : " + paitent.getName());

        Scanner s = new Scanner(System.in);

        boolean shouldFinish = false;
        while (!shouldFinish){
            System.out.println("Choose an Organ:  "+
                    "\n\t1. Left Eye"+
                    "\n\t2. Right Eye" +
                    "\n\t3. Heart" +
                    "\n\t4. Stomach" +
                    "\n\t5. Skin" +
                    "\n\t6. Quit"
            );
            int choice = s.nextInt();
            switch (choice){
                case 1:
                    paitent.getLeftEye().getDetail();
                    if (paitent.getLeftEye().getOpened()){
                        System.out.println("Open Eye ");
                    }else {
                        System.out.println("Closed");
                    }
                    break;
                case 2:
                    paitent.getRightEye().getDetail();
                    if (paitent.getRightEye().getOpened()){
                        System.out.println("Open Eye ");
                    }else {
                        System.out.println("Closed");
                    }
                    break;
                default:
                    shouldFinish = true;
                    break;

            }

        }
    }
}
