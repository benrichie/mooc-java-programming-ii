/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benri
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    
    private ChangeHistory changehistory;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        
        this.changehistory = new ChangeHistory();
        // Set the initial balance as the initial balance of the warehouse
        super.addToWarehouse(initialBalance);
        // as well as the first value of the change history.
        this.changehistory.add(initialBalance);
    }
    
    public String history(){
        return this.changehistory.toString();
    }
    
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changehistory.add(getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        double amountTaken = super.takeFromWarehouse(amount);
        this.changehistory.add(getBalance());
        return amountTaken;
    }
    
        public void printAnalysis() {
        System.out.println("Product: " + getName()
                + "\nHistory: " + changehistory.toString()
                + "\nLargest amount of product: " + changehistory.maxValue() 
                + "\nSmallest amount of product: " + changehistory.minValue()
                + "\nAverage: " + changehistory.average());
    }
 
}
