
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    /* these instance variables have been defined as final, meaning 
       that once set, their value can't be changed */
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
    public int hashCode(){
        return Objects.hash(country, liNumber);
    }
    
    public boolean equals(Object comparedObject){
        // If the variable are the same.
        if(this == comparedObject){
            return true;
        }
        
        // If the object is not of the same type.
        if(!(comparedObject instanceof LicensePlate)){
            return false;
        }
        
        // Convert comparedObject to relevant Object to be properly compared.
        LicensePlate comparedPlate = (LicensePlate) comparedObject;
        
        // If the instance variables are the same, so are the object.
        // .equals for String and == for int
        if(this.liNumber.equals(comparedPlate.liNumber) &&
           this.country.equals(comparedPlate.country)){
            return true;
        }
        return false;
        
    }
}