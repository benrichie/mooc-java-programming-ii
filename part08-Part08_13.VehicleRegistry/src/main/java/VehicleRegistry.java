/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benri
 */
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> owners;
    
    public VehicleRegistry(){
        this.owners = new HashMap<>();
    }
    
    public boolean add(LicensePlate licenseplate, String owner){
        if(owners.get(licenseplate) == null){
            owners.put(licenseplate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licenseplate){
        if(owners.get(licenseplate) == null){
            return null;
        } else {
            return owners.get(licenseplate);
        }
        
    }
    
    public boolean remove(LicensePlate licenseplate){
        if(!(owners.get(licenseplate) == null)) {
            owners.remove(licenseplate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates(){
        for(LicensePlate l : owners.keySet()){
            System.out.println(l);
        }     
    }
    
    public void printOwners(){
        ArrayList<String> ownerCheck = new ArrayList<>();
        
        //addings all the owners without to the list without repetitions
        for(String o : owners.values()){
            
            if(!ownerCheck.contains(o)){
                ownerCheck.add(o);
            }
        }
        
        //after list completed then we print 
        for(String o : ownerCheck){
            System.out.println(o);
        }
    }
    
}
