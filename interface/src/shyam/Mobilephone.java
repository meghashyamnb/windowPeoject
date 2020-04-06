package shyam;

public class Mobilephone implements iTeliphone{

    private int myNumber;
    private boolean isRinging;
    private boolean isOn;


    public Mobilephone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn =true;
        System.out.println("Mobile Phone is powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now Ringing "+ phoneNumber +" on Mobile phone");
        }else {
            System.out.println("Mobile is switched Off");
        }


    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Melody Playing");

        }else{
            isRinging=false;
            System.out.println("Mobile phone not on or number diffrent");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
