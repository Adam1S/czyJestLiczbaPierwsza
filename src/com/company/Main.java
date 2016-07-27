package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);

        do{
            //print message: please input a number
            System.out.println("Wprowadź liczbę.");

            //read from console
            number = sc.nextInt();

            boolean isPrime=checkPrimarity(number);

            if (isPrime){
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }

        }while (number!=0);
    }

    public static boolean checkPrimarity(int number){
        boolean isPrime=true;

        if (number==1){
            isPrime=false;
        }

        for(int i=2; i<number; i++){
            if(number%i==0){
                isPrime=false;
            }
        }

        return isPrime;
    }

}
