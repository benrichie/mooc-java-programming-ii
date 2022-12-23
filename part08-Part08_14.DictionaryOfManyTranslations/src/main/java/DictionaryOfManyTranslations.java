/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benri
 */
import java.util.HashMap;
import java.util.ArrayList;
public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> dictionary;
    
    public DictionaryOfManyTranslations(){
        this.dictionary = new HashMap<>();
    }
    
    public void add(String word, String translation){
        // An empty list has to be added for a new user if one has not already been added.
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        
        // Let's first retrieve the list containing the exercises completed by the user and add to it.
        // Define the ArrayList.
        //ArrayList<String> translated = this.dictionary.get(word);
        // Add to the ArrayList.
        //translated.add(translation);
        
        this.dictionary.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
        ArrayList<String> emptyList = new ArrayList<>();
        
        return this.dictionary.getOrDefault(word, emptyList);
    }
    
    public void remove(String word){
        this.dictionary.remove(word);
    }
    
}
