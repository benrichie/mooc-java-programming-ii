/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author 61410
 */
import java.util.HashMap;
import java.util.ArrayList;
 
public class StorageFacility {
 
    private HashMap<String,ArrayList<String>> storage;
    
    public StorageFacility(){
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item){
        //  An empty list is added if one has not already been.
        this.storage.putIfAbsent(unit, new ArrayList<>());
        
        
        // Add the item based on the unit.
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents (String storageUnit){
        ArrayList<String> emptyList = new ArrayList<>();
        
        // If there is a key that coincides with storageUnit return values, else return emptyList
        return this.storage.getOrDefault(storageUnit, emptyList);
    }
    
    public void remove(String storageUnit, String item){
        // Remove item in unit
        this.storage.get(storageUnit).remove(item);
        
        // If the unit is empty remove the unit 
        if(this.storage.get(storageUnit).isEmpty()){
            this.storage.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits(){ // All units that contain items are to be listed.
        ArrayList<String> listUnits = new ArrayList<>();
        
        // keySet() to go through keys.
        for(String u : storage.keySet()){
            if(!(this.storage.get(u).isEmpty())){
                listUnits.add(u);
            }
        }
        
       return listUnits;
    }
    
 
}
 