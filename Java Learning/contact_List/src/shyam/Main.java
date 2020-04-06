package shyam;

import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("9008744524");



    public static void main(String[] args) {
	// write your code here

        boolean quit = false;
        startPhone();
        printAction();
        while (!quit){
            System.out.println("\nEnter Action:(6 to show available action)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("\nShutting down");
                    quit= true;
                    break;
                case 1:
                    printContacts();
                    break;
            }

        }
    }

    private static void printContacts(){

    }

    private static void startPhone(){
        System.out.println("Starting phone");

    }
    private static void printAction(){
        System.out.println("\nAvalible Actions:\npress");
        System.out.println("0 - to Shutdown\n"+
                           "1 - to printAction\n"+
                           "2 - add contact new contact"+
                            "3 - to update an existing contact\n"+
                            "4 - to remove the contact\n"+
                            "5 - Query if any exists\n"+
                            "6 - To print available contact\n");
        System.out.println("Chouse your action");
    }
}
