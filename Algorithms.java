import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("words.txt");
        int twoletters = twoletters();
        System.out.println("two letters: " + twoletters);
        int longest = longest();
        System.out.println("longest: " + longest);
        int palindrome = palindromes();
        System.out.println("palindromes: " + palindrome);
    }
        public static int twoletters() throws FileNotFoundException{
            s = new Scanner(f);
            int count = 0;
            while(s.hasNext()){
                if(s.next().length() == 2){
                    count++;
                }
            }
            return count;
        }

        public static int longest() throws FileNotFoundException{
            s = new Scanner(f);
            String longest = "";
            int max = 0;
            int count = 0;
            while(s.hasNext()){
                String current = s.next();
                if(s.next().length() == 14){
                    count++;
                }
                
            }
            return count;
        }
        public static int palindromes() throws FileNotFoundException{
            s = new Scanner(f);
            int count = 0;
            String word = "";
            while(s.hasNext()){
                String current = s.next();
                for(int i = 0;  i <= current.length(); i++){
                    word = word + current.substring(i, i + 1);
                if(current.equals(word)){
                    count++;
                }
                
            }
        }
        return count;
}
}

    