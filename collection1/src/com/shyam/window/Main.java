package com.shyam.window;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theater theater = new Theater("Olempic", 8, 12);
        List<Theater.Seat> seatCopy = new ArrayList<>(theater.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if(theater.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        }else{
            System.out.println("Seat is reserved");
        }

        Collections.reverse(seatCopy);
        System.out.println("Print SeatCopy");
        printList(seatCopy);

        Theater.Seat miniSeat = Collections.min(seatCopy);
        Theater.Seat maxSeats = Collections.max(seatCopy);
        System.out.println("Min seat Number is "+ miniSeat.getSeatNumber());
        System.out.println("Max seat Number is "+ maxSeats.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Printing Sorted seatCopy");
        printList(seatCopy);

    }
    public static void printList(List<Theater.Seat> list){
        for(Theater.Seat seat : list){
            System.out.println(""+seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("======================================================");
    }

    public static void sortList(List<? extends Theater.Seat> list){
        for(int i=0; i<list.size()-1; i++){
            for( int j=i+1 ;j<list.size(); j++){
                if(list.get(i).compareTo(list.get(j))>0){
                    Collections.swap(list,i,j);
                }
            }
        }
    }


}
