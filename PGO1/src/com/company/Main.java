package com.company;

public class Main {

    public static void main(String[] args) {
	doWhileLoopExample();
    }
    public static void forLoopExample(){
        for (int i=0; i<10; i++){
            System.out.println("Hello World!");
        }
    }
    public static void whileLoopExample(){
        int i =0;
        while(i<10){
            System.out.println("Hello World!");
            i++;
        }
    }
    public static void doWhileLoopExample(){
        int i = 0;
        do{System.out.println("HelloWorld!");
            i++;
        }
        while(i<10);
    }
}
