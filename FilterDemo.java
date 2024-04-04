import java.util.*;
public class FilterDemo {
    public static ArrayList<Object> collectAll(ArrayList<Object> objects, Filter f) {
        ArrayList<Object> result = new ArrayList<Object>();
        for (Object obj : objects) {
            if (f.accept(obj)) {
                result.add(obj);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner kappa = new Scanner(System.in);
        ArrayList<Object> words = new ArrayList<Object>();
        System.out.println("Enter a list of words, a blank line to quit:");
        String word = kappa.nextLine();
        while (word.length()>0 ) {
            words.add(word);
            word = kappa.nextLine();
            if (word.equals("")) {
                break;
            }
        
        }
        ArrayList<Object> shortWords = collectAll(words, new shortWordFilter());
        System.out.println("The short words:");
        for (Object s : shortWords) {
            System.out.println((String) s);
        }
    }
}