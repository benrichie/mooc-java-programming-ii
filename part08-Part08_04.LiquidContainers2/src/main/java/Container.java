/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 61410
 */
public class Container {

   private int totalAmount;
    
    public Container(){
         this.totalAmount = 0;  
    }
    
    public int contains(){
        return this.totalAmount;
    }
    
    public void add(int amountToAdd){
        if(amountToAdd < 0){
            return;
            
        } else if(this.contains() + amountToAdd <= 100){
            totalAmount += amountToAdd;
        } else { 
            totalAmount = 100;
        }
    }
    
    public void remove(int amountToRemove){
        if(amountToRemove < 0){
            return;
        }
        if(this.contains() - amountToRemove < 0){
            totalAmount = 0;
        } else {
            totalAmount -= amountToRemove;
        }
        
    }
    
   
   public String toString(){
       return this.contains() + "/100";
   }
    
}
