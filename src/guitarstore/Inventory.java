/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitarstore;

import java.util.ArrayList;

/**
 *
 * @author giovandemarco
 */
public class Inventory {
    private ArrayList<Guitar> ArrGuitars;

    public Inventory() {
        ArrGuitars = new ArrayList();
    }
    
    public void addGuitar(String serialNumber, 
                          double price,
                          Builder builder, 
                          String model,
                          Type type, 
                          Wood backWood,
                          Wood topWood,
                          enumStrings numStrings){
        
        //Creating new Object
        Guitar guitar = new Guitar(serialNumber,
                                    price,
                                    builder,
                                    model,
                                    type,
                                    backWood,
                                    topWood,
                                    numStrings);
        //Adding a Guitar in ArrayList
        ArrGuitars.add(guitar);
        LoggerApp.getInstance(" - successfully created inventory ", "");
    }
    
    public Guitar getGuitar(String serialNumber){
        for(Guitar guitar:ArrGuitars){
            //Searching for a Guitar with especific Serial Number
            if(guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }//end-for
        //Guitar not found
        return null;
    }
    
    public ArrayList Search(GuitarSpec searchSpec){
        ArrayList<Guitar> matchingGuitars = new ArrayList();
        
        for(Guitar objGuitar:ArrGuitars){
            if(objGuitar.getSpec().matches(searchSpec)){
                //Guitar with Search Specs adding into array
                matchingGuitars.add(objGuitar);  
            }
        }//end-for
        
        //Return Array with zero or more guitars
        return matchingGuitars;
    }
}
