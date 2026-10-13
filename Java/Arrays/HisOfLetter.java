package Arrays;

public class HisOfLetter {
    public static void main(String[] args) {
        String str = "Hello World";
        String strFix = str.toLowerCase(); 
        int[] alphabet = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char letter = strFix.charAt(i);
            if (letter < 'a' || letter > 'z') {
                continue;
            }
            int index = letter - 'a';
            alphabet[index] += 1;
        }
        
        for (int i = 0; i < alphabet.length; i++) {
            char alphabetConvert = (char) (i + 'a');
            System.out.println(alphabetConvert + " : " + alphabet[i]);
        }
    }    
}
