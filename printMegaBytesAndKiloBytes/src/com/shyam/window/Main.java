package com.shyam.window;

public class Main {

    public static void main(String[] args) {
        for(int i=1;i>7;i++){
            System.out.println("interest ="+ calculateInterest(1000,i));
            System.out.println("ji");
        }




    }

    public static double calculateInterest(double amount,double interestRate){
        return (amount*(interestRate/100));
    }













}
