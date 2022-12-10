/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benri
 */
import java.util.Scanner;

public class UserInterface {
    
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start(){
        
        boolean shouldLoop = true;
        
        while(shouldLoop){
            
            
            String input = scanner.nextLine();
            System.out.println("Command: ");
            
            if(input.equals("stop")){
                shouldLoop = false;
                break;
            }
            else if(input.equals("add")){
                System.out.println("To add: ");
                
                String wordToAdd = scanner.nextLine();
                
                todoList.add(wordToAdd);    
            }
            else if(input.equals("list")){
                todoList.print();
            }
            else if(input.equals("remove")){
                System.out.println("Which one is removed: ");
                
                int toRemove = Integer.valueOf(scanner.nextLine());
                
                todoList.remove(toRemove);
            }
        }
    }
}
