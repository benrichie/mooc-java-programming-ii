
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            
            int val = Integer.parseInt(input);
            int answer = val * val * val;
            System.out.println(answer);
            
        }

    }
}
