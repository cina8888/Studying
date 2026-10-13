import java.util.Scanner;

public class StringRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userString;
        String res = "";
        System.out.print("Please enter the string: ");
        userString = sc.nextLine();
        String[] arrWords = userString.split(" ");
        String lastWord = arrWords[arrWords.length -1];
        if (lastWord.equals("Done") || lastWord.equals("d") || lastWord.equals("done")) {
            for (int i = arrWords.length - 2; i >= 0; i--) { 
                res += arrWords[i] + " ";
            }
        }
        System.out.println(res);
        sc.close();
    }
}