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
public class BoxWithMaxWeight extends Box {
    
    private ArrayList<Item> listOfItems;
    private int capacity;
    
    public BoxWithMaxWeight(int capacity){
        
        this.capacity = capacity;
        this.listOfItems = new ArrayList<>();
    }
    
    /* You can add an item to a BoxWithMaxWeight when and only when,
adding the item won't cause the boxes maximum weight capacity to be exceeded. */
    @Override
    public void add(Item item){
        
        if(getTotalWeight() + item.getWeight() <= this.capacity){
            
            listOfItems.add(item);
        }
    }
    
    /* If superclass contains method then you must Override */
    @Override
    public boolean isInBox(Item item){
        
        return listOfItems.contains(item); 
    }
    
    /* Find the total weight of the items within the box */
    public int getTotalWeight(){
        int sum = 0;
        for(Item item : listOfItems){
            
            sum += item.getWeight();
        }
        return sum;
    }
    
    

}
