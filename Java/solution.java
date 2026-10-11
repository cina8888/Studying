import java.util.Scanner;

/*class Cel2Fah {
    public static void main(String[] args) {
        float num;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a temparature in Celcius: ");
        num = in.nextFloat();
        float temp = (num*(9.0f/5)) + 32;
        System.out.println("Num " + num + " C = " + temp + " F");
        in.close();
    }
}*/

class Second2hms {
    public static void main(String[] args) {
        int second;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter second: ");
        second = in.nextInt();
        int hour = (second/60)/60;
        int minute = (second/60)%60;
        int secondLast = second%60;
        System.out.println(hour + "hours, " + minute + " minutes, and " + secondLast + " seconds");
        in.close();
    }
}