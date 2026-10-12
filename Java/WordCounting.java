import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class WordCounting {
    public static void main(String[] args) {
        try {
            File fileF = new File("resources/words.txt");
            HashMap<String, Integer> arrWord = new HashMap<>(); 
            String currWord;
            System.out.println("Opening file words.txt in folder resources");
            Scanner readin = new Scanner(fileF);
            while (readin.hasNextLine()) {
                currWord = readin.nextLine();
                if (arrWord.containsKey(currWord)) {
                    arrWord.put(currWord, arrWord.get(currWord) + 1);
                } else {
                    arrWord.put(currWord, 1);
                }
            }
            readin.close();
            for (Map.Entry<String, Integer> entry : arrWord.entrySet()) {
                System.out.println("The word: " + entry.getKey() + " appear " + entry.getValue() + " times");
            }
        } catch (IOException e) {
            System.out.println("File not found! or Can not open!");
            e.printStackTrace();
        }
    }
}
