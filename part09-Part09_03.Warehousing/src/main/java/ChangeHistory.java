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
import java.util.Collections;
public class ChangeHistory {
    
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    
    public void add(double status){
        history.add(status);
    }
    
    public void clear(){
        history.clear();
    }
    
    @Override
    public String toString(){
        return history.toString();
    }
    
    public double maxValue(){
        double max = history.indexOf(0);
        for(double i : history){
            
            if(history.isEmpty()){
                return 0.0;
            }
            
            if(i > max){
                max = i;
            }

        }
        return max;
    }
    
    public double minValue(){
        
        if(history.isEmpty()){
            return 0.0;
        }
        
        return 1.0 * Collections.min(history); // easier way
    }
    
    public double average(){
        int sum = 0;
        
        if(history.isEmpty()){
            return 0.0;
        }
        
        for(double a : history){
            sum+=a;
        }
        
        return (double) sum / history.size();
    }
}
