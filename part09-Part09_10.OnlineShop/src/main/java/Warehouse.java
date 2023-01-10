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
import java.util.Map;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    
    private Map<String, Integer> Product;
    private Map<String, Integer> stockBalance;
    
    public Warehouse(){
        this.Product = new HashMap<>();
        this.stockBalance = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        
        Product.put(product, price);
        stockBalance.put(product, stock);
        
    }
    
    public int price(String product){
        
        return Product.getOrDefault(product, -99);
    }
    
    public int stock(String product){
        
        return stockBalance.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        
        if(this.stock(product) != 0){
            
            stockBalance.put(product, stockBalance.get(product) - 1 );
                    
            return true;
        }
        
        return false;
    }
    
    public Set<String> products(){
        // create  hashSet to go through 
        // then print the lil bih
        
        
        
        Set<String> productSet = new HashSet<>();
        
        for(String key : Product.keySet()){
            productSet.add(key);
        }
        
        return productSet;
    }

    
}
