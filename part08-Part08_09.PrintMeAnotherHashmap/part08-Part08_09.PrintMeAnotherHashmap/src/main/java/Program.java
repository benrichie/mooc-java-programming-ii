
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");

        // Test your program here!
        
    }
    public static String cleanString(String strToClean){
        if(strToClean == null){
            return "";
        }
        return strToClean.toLowerCase().trim();
    }
    
    /*prints all the *values* in the hashmap given as a parameter using the toString method
    of the Book objects*/
    public static void printValues(HashMap<String, Book> hashmap){
        for(Book k : hashmap.values()){
            System.out.println(k);
            
        }
    }
    
    /*prints only the Books in the given hashmap which name contains the given string. You can 
    find out the name of the Book with the method getName*/
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text){
        for(Book k : hashmap.values()){
            //if a book contains the cleaned text, print the lil bih's values
            if(k.getName().contains(cleanString(text))){
                
                System.out.println(k);
            }
        }
    }

}
