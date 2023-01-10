/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benri
 */
import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {

    private Map<String, Item> itemMap;
    
    public ShoppingCart(){
        this.itemMap = new HashMap<>();
    }
    
    public void add(String product, int price){
        
        if(itemMap.keySet().contains(product)){
            
            increaseQuantity(product); 
            
        } else {
            itemMap.put(product, new Item(product, 1 ,price)); //  else add new item
        }
        
    }
    
    public void increaseQuantity(String product) {

        this.itemMap.get(product).increaseQuantity();

    }
    
    public int price() {

        int totalPrice = 0;

        for (Item e : itemMap.values()) {

            totalPrice += e.price();
        }

        return totalPrice;
    }
    
    public void print(){
        
        for(String p : itemMap.keySet()){
            System.out.println(itemMap.get(p).toString());
        }
    }
    
}
