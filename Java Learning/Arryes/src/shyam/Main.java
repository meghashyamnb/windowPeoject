package shyam;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {1,2,3,4,5,6};
        System.out.println("Order = "+ Arrays.toString(array));
        reverse(array);
        System.out.println("Reverse order = "+ Arrays.toString(array));
    }

    public static void reverse(int[] array){
        int maxvalue = array.length-1;
        int halflength = array.length/2;
        for(int i =0 ;i < halflength; i++){
            int temp = array[i];
            array[i]= array[maxvalue-i];
            array[maxvalue-i] = temp;

        }
    }
}
