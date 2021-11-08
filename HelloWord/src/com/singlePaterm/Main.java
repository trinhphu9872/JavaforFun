package com.singlePaterm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Contact> contacts;
    private static Scanner scanner;
    private static int i=0;
    public static void main(String[] args) {
        contacts = new ArrayList<>();
        System.out.println("Welcome to program");
        showIntialOptions();


    }
    private static void showIntialOptions(){
        System.out.println("Select one option" +
                "\n\t1. Manage Contract" +
                "\n\t2. Messagee "+
                "\n\t3. Quit ");
        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                manageContract();
                break;
            case 2:
                messageCheck();
                break;
            default:
                break;
        }

    }
    private static void manageContract(){
        System.out.println("Plase choose one oprion in Contract : " +
                "\n\t1. Show all contracts " +
                "\n\t2. Add New Contracts "+
                "\n\t3. Sreach Contracts" +
                "\n\t4. Delete Contracts "+
                "\n\t5. Go back " );
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                showAllContract();
                break;
            case 2:
                addNewContract();
                break;
            case 3:
                searchContract();
                break;
            case 4:
                deleteContract();
                break;
            default:
                showIntialOptions();
                break;
        }
    }
    private static void showAllContract(){
        for (Contact c: contacts) {
            c.getDetail();
        }
        showIntialOptions();
    }
    private static void addNewContract(){
        System.out.println("Add new Contract now" +
                "\n Plase user add new Name");
        String name = scanner.next();
        System.out.println("Number add : ");
        String number = scanner.next();
        System.out.println("Email add : ");
        String email = scanner.next();
//        System.out.println("Messages add : ");
//        String message = scanner.next();
        boolean flag = name.equals(" ") || email.equals(" ") || number.equals(" ")  ? true : false;
        if(flag){
            System.out.println("Now add full infomation full contract : ");
            addNewContract();
        }else {
            Contact contact = new Contact(name,number,email);
            contacts.add(contact);
        }

        showIntialOptions();



    }
    private static void searchContract(){
        System.out.println("Plase u input for keyboard sreach now :");
        String key = scanner.next();
        boolean flag = false;
        if (key.equals(" ")){
            System.out.println("input key search : ");
            searchContract();
        }else {
            for (Contact c: contacts) {
                if (c.getName().equals(key)){
                    System.out.println("Checked");
                    flag = true;
                    break;
                }
            }
        }
        if (!flag){
            System.out.println("no include in db ");
        }else {
            System.out.println("Checked done");
        }
        showIntialOptions();

    }
    private static void deleteContract(){
        System.out.println("Plase u input for keyboard delete now :");
        String key = scanner.next();
        boolean flag = false;
        if (key.equals(" ")){
            System.out.println("input key search : ");
            searchContract();
        }else {
            for (Contact c: contacts) {
                if (c.getName().equals(key)){
                    contacts.remove(c);
                    flag = true;
                    break;
                }
            }
        }
        if (!flag){
            System.out.println("no include in db ");
        }else {
            System.out.println("Checked done");
        }
        showIntialOptions();


    }



    private static void messageCheck() {
        System.out.println("Select one option" +
                "\n\t1. show all message" +
                "\n\t2. send a new message "+
                "\n\t3. go back ");
        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                showAllMessage();
                break;
            case 2:
                sendNoMessage();
                break;
            default:
                showIntialOptions();
                break;
        }
    }

    private static void sendNoMessage() {
        System.out.println("Who send : ");
        String name = scanner.next();
        if (name.equals(" ")){
            System.out.println("input name ");
            sendNoMessage();
        }else {
            boolean flag = false;
            if (name.equals(" ")){
                System.out.println("input key search : ");
                sendNoMessage();
            }else {
                for (Contact c: contacts) {
                    if (c.getName().equals(name)){
                        flag = true;
                        break;
                    }
                }
            }
            if (flag){
                System.out.println("What do u say : ");
                String text = scanner.next();
                if (text.equals(" ")){
                    System.out.println("Plase input noew ");
                    sendNoMessage();
                }else {
                    i++;
                    Messages messages = new Messages(text,name,i);
                    for (Contact c: contacts) {
                        if (c.getName().equals(name)){
                            ArrayList<Messages> newMes = c.getMessages();
                            newMes.add(messages);
                            c.setMessages(newMes);
                        }
                    }
                }
                showIntialOptions();
            }
        }

    }

    private static void showAllMessage() {
        ArrayList<Messages> allMes = new ArrayList<>();
        for (Contact c: contacts) {
            allMes.addAll(c.getMessages());
        }
        if (allMes.size() > 0){
            for (Messages m: allMes) {
                m.getDetail();
                System.out.println("xxxxxxxx");
            }
        }else {
            System.out.println("no");
        }
        showIntialOptions();
    }
}
