package shyam;

public class Main {

    public static void main(String[] args) {
	// write your code here

        iTeliphone shyamPhone;
        shyamPhone = new Deskphone(123456);
        shyamPhone.powerOn();
        shyamPhone.callPhone(123456);
        shyamPhone.answer();

        shyamPhone = new Mobilephone(234567);
        shyamPhone.powerOn();
        shyamPhone.callPhone(234567);
        shyamPhone.answer();

        


    }
}
