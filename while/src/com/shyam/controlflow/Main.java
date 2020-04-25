package com.shyam.controlflow;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("this is sum digit "+sumDigit(1909));
        System.out.println("this is sum digit "+sumDigit(-1829));


    }

    public static int sumDigit(int number){
        if(number <10){
            return -1;
        }
        int sum =0;
        while (number >0){
            int digit = number % 10;
            sum += digit;
            number /= 10;

        }

        return sum;
    }






}
