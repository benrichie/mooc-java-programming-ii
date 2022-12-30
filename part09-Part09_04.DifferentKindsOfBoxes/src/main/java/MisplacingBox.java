/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benri
 */
import java.util.ArrayList;
public class MisplacingBox extends Box {
    
    private ArrayList<Item> missing;
    
    public MisplacingBox(){
        this.missing = new ArrayList<>();
    }
    
    @Override
    public void add(Item item){
         missing.add(item);
    }
    
    @Override
    public boolean isInBox(Item item){
        
        return false;
    }
}
