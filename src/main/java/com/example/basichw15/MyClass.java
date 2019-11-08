package com.example.basichw15;


import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What time is it? (hr:min:sec)");
        String s = scanner.next();
        String HR,MIN;
        int hr,min;
        int F =s.indexOf(":");
        int E = s.lastIndexOf(":");
        HR = s.substring(0,F);
        MIN = s.substring(F+1,E);
        hr=Integer.parseInt(HR);
        min=Integer.parseInt(MIN);
        int totalM =hr*60+min;
        if(totalM>=450&&totalM<1020){
            System.out.println("Now is class time");
        }
        else {
            System.out.println("Now isn't class time.It's from 7:30 to 17:00.");
        }


    }
}