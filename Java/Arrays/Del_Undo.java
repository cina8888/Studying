package Arrays;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Stack;

public class Del_Undo {
    public static void main(String[] args) {
        ArrayList<String> list = Readfile();
        Stack<String> undo = new Stack<>();
        Stack<String> res = new Stack<>();
        for (int i = 0; i < list.size(); i++ ) {
            String item = list.get(i);
            if (item.equals("DEL")) {
                if (!res.isEmpty()) {
                    undo.push(res.pop());
                }
            } else if (item.equals("UNDO")) {
                if (!undo.isEmpty()) {
                    res.push(undo.pop());
                }
            } else {
                res.push(list.get(i));
            }
        }
        System.out.print(String.join(" ", res));
    }

    public static ArrayList<String> Readfile() {
        ArrayList<String> list = new ArrayList<>();
        try {
            File fileF = new File("topic/letter.txt");
            Scanner sc = new Scanner(fileF);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] items = line.split(",");
                for (String item: items) {
                    list.add(item);
                } 
            }
            sc.close();
            return list;
        } catch (IOException e) {
            System.out.println("File not exist or file not found");
            e.printStackTrace();
            return list;
        }
        
    }
}
