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
public class TodoList {
    
    private ArrayList<String> list;
    
    public TodoList(){
        this.list = new ArrayList<>();
    }
    
    public void add(String task){
        this.list.add(task);
    }
    
    public void print(){
        int index = 1;
        
        for(String l : list){
            System.out.println(index + ": " + l);
            index++;
        }
    }
    
    public void remove(int number){
        
        list.remove(number - 1);
    }
    
    
    
}
