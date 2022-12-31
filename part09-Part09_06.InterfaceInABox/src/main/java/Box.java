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
public class Box implements Packable{
    
    private double maxCapacity;
    private ArrayList<Packable> list;
    
    public Box(double maxCapacity){
        this.maxCapacity = maxCapacity;
        this.list = new ArrayList<>();
    }
    
    public void add(Packable itemToPack){
        if(this.weight() + itemToPack.weight() <= maxCapacity ){ /* this.weight refers to weight of list */
            list.add(itemToPack);
        }
    }
    
    @Override /* Calculates weight of the box */
    public double weight() {
        double sum = 0;

        for (Packable e : list) {
            sum += e.weight();

        }

        return (double) sum;
    }

    
    public String toString(){
        return "Box: " + list.size() + " items, total weight " + this.weight() + " kg";
    }
    
}
