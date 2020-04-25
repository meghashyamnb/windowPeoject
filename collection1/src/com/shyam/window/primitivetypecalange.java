package com.shyam.window;

public class primitivetypecalange {

    public static void main(String[] args) {

        printConversion(2.0);


       }

    public static long toMilesPerHour(double kilometersPerHour){

        if(kilometersPerHour < 0){
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);


    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid value");
        }else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " Km/h= "+milesPerHour +" mi/h");

        }
    }






















}
