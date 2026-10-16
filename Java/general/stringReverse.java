import java.util.Scanner;

public class stringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        String stringReverse = "";
        System.out.print("Enter a string: ");
        str = scan.nextLine();
        for (int i = str.length()-1; i >= 0; i--) {
            stringReverse += str.charAt(i);
        }
        System.out.println(stringReverse);
        scan.close();   
    }
}   