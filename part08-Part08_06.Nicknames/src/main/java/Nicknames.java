
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> hm = new HashMap<>();
        
        hm.put("matthew", "matt");
        hm.put("michael", "mix");
        hm.put("arthur", "art");
        
        System.out.println(hm.get("matthew"));
    }

}
