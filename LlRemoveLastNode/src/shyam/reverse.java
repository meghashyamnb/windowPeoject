package shyam;

public class reverse {

    public static void main(String a[]){
        System.out.println("5678 is reverse : "+reversenumber(5678));
        System.out.println("9008744524 is reverse : "+reversenumber(90087445));
        System.out.println("6789 is reverse :"+reversenumber(6789));

    }
    static int reversenumber(int num){
        int reverse = 0;
        while(num !=0){
            reverse = reverse*10 + num%10;
            num = num/10;
        }
        return reverse;
    }
}
