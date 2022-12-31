/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benri
 */
public class CustomTacoBox implements TacoBox {
    
    int tacos;
    
    public CustomTacoBox(int taco){
        this.tacos = taco;
    }

    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
       if(tacos != 0){
           tacos--;
       }
    }
}
