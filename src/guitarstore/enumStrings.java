/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitarstore;

/**
 *
 * @author giovandemarco
 */
public enum enumStrings {
    
    FOUR(4), FIVE(5), SIX(6), TWELVE(12);
    
    private final int value;
    
    //Enum Constructor initalizing Values
    private enumStrings(int value){
        this.value = value;
    }
     

    public int getValue() {
        return value;
    }
     
    
    
}
