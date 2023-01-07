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

public class Warehouse {
    
    private Map<String, Integer> Product;
    private int stock;
    
    public Warehouse(){
        this.Product = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        Product.put(product, price);
        this.stock += stock;
    }
    
    public int price(String product){
        
        return Product.getOrDefault(product, -99);
    }
}
