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
public class Abbreviations {
    
    private HashMap<String, String> hm; 
    
    public Abbreviations(){
        this.hm = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        
        hm.put(stringSanatize(abbreviation), explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        
        return this.hm.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation){
        
        return this.hm.get(stringSanatize(abbreviation));
    }
    
    public static String stringSanatize(String strToClean){
        
        if(strToClean == null){
            return "";
        }
        
        return strToClean.toLowerCase().trim();
    }
}
