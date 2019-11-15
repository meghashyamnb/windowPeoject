public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int a = 5;

        System.out.println(a);

        int newvalue = 50;
        if (newvalue == 50)
            System.out.println("this is error");


        double c = 20;
        double b = 80;

        double result1 = c + b;

        double result2 = result1 * 25;
        double result3 = result2 % 40;
        System.out.println("my result " + result2);
        System.out.println("my result2 "+ result3);

        if (result3 <= 20) {
            System.out.println("the result is equal to 20");
        }else {
            System.out.printf("the result is out of limit");
        }

        boolean gameover = true;
        int score = 10000;
        int levelCompletion = 8;
        int bonus = 200;

        if (gameover = true){
            int finalscore = score +(levelCompletion * bonus);
            System.out.println("the final score "+ finalscore);
        }







    }
}
