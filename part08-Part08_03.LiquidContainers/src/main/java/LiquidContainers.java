
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int container1 = 0;
        int container2 = 0;
        int max = 100;

        while (true) {

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            // we use string because we want to input, for example, " add 50 "
            String[] parts = input.split(" ");
            
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
           
            System.out.println("First: " + container1 + "/" + max);
            System.out.println("Second: " + container2 + "/" + max);
            
            // now functionality; could use a switch case but will use consecutive if else
            
            //add
            if(command.equals("add") && amount >= 0){
                if(container1 <= max){
                    container1 += amount;
                } if(container1 > max){
                    container1 = max;
                }
            } 
            else if(command.equals("move") && amount >= 0){
                if ((container1 - amount) >= 0) {
                    container2 += amount;
                    container1 -= amount;
                    if (container2 >= max) {
                        container2 = max;
                    }
                } else if ((container1 - amount) < 0) {
                    container2 += container1;
                    container1 = 0;
                    if (container2 >= max) {
                        container2 = max;
                    }
                }
            } else if(command.equals("remove") && amount >= 0){
                if ((container2 - amount) >= 0) {
                    container2 -= amount;
                } else if ((container2 - amount) < 0) {
                    container2 = 0;
                }
            }
            

        }
        
            System.out.println("First: " + container1 + "/" + max);
            System.out.println("Second: " + container2 + "/" + max);
        
    }

}
