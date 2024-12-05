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

        public static String longest() throws FileNotFoundException{
            s = new Scanner(f);
            String longest = "";
            int max = 0;
            while(s.hasNext()){
                String current = s.next();
                if(s.next().length() > max){
                    max = current.length();
                    longest += current + "";
                }
                
            }
        }
}
    