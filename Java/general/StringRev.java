import java.util.Scanner;

public class StringRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder res = new StringBuilder();
        System.out.print("Please enter the string: ");
        String[] arrWords = sc.nextLine().split("\\s+");
        String lastWord = arrWords[arrWords.length -1];
        if (lastWord.equals("Done") || lastWord.equals("d") || lastWord.equals("done")) {
            for (int i = arrWords.length - 2; i >= 0; i--) { 
                res.append(arrWords[i]).append(" ");
            }
        }
        System.out.println(res);
        sc.close();
    }
}