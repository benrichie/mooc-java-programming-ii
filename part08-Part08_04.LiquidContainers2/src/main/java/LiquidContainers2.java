
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();
        
        
        boolean shouldLoop = true; // u can tell it when to stop looping
        while(shouldLoop){
            System.out.println("First: " + container1);	
            System.out.println("Second: " + container2);
            
            String userInput = scanner.nextLine();
            if(userInput.equals("quit")){
                shouldLoop = false;
                break;
            }
            
            String[] userInputSplit = userInput.split(" ");

            String command = userInputSplit[0];

            int amount = Integer.valueOf(userInputSplit[1]);
            
            switch(command){
                case "add":

                    container1.add(amount);

                    break;
                case "move":
                    
                    // if its negative or the value to move is return and do nothing
                    if (amount <= 0 || container1.contains() == 0) {
                        return;
                    }
                    // if it ends up being a negative valule when moving says trying to move 40 from 30
                    // just move the total value of container1
                    if (container1.contains() - amount < 0) {
                        amount = container1.contains();
                    }

                    container1.remove(amount);

                    container2.add(amount);

                    break;
                case "remove":
                    container2.remove(amount);

                    break;
                default:
                    System.out.println("Unknown command");
                    
            }

        }
    }

}
