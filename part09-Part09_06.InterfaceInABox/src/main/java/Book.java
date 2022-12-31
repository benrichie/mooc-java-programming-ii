/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benri
 */
public class Book implements Packable {
    
    private String author;
    private String name;
    private double weightOf;
    
    public Book(String author, String name, double weightOf){
        this.author = author;
        this.name = name;
        this.weightOf = weightOf;
    }
    @Override
    public double weight() {
        return this.weightOf;
    }
    
    public String toString(){
        return this.author + ": " + this.name;
    }
}
