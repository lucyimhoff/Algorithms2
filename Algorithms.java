import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("words.txt");
        String twoletters = twoletters();
        System.out.println("two letters: " + twoletters);
        int longest = longest();
        System.out.println("longest: " + longest);
    }
        public static String twoletters() throws FileNotFoundException{
            s = new Scanner(f);
            String twoletters = "";
            while(s.hasNext()){
                if(s.next().length() == 2){
                    String current = s.nextLine();
                    twoletters += (current + "");
                }
            }
            return twoletters;
        }

        public static int longest() throws FileNotFoundException{
            s = new Scanner(f);
            String longest = "";
            int max = 0;
            int count = 0;
            while(s.hasNext()){
                String current = s.next();
                if(s.next().length() > max){
                    max = current.length();
                    longest += current;
                }
                
                if(s.next().length() == max){
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
                for(int i = s.next().length()- 1; i > 0; i--){
                    //word = word + 

                }
                
            }
            return count;
        }
}

    