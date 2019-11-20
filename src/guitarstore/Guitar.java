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
public class Guitar {

    private String SerialNumber;
    private double Price;
    private GuitarSpec Spec;

    public Guitar(String SerialNumber,
            double Price,
            Builder Builder,
            String Model,
            Type Type,
            Wood backWood,
            Wood topWood,
            enumStrings numStrings) {
        this.SerialNumber = SerialNumber;
        this.Price = Price;
        
        //Creating a new Guitar Specification
        this.Spec = new GuitarSpec(Model,Builder,Type,backWood,topWood, numStrings);


    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

 
    public double getPrice() {
        return Price;
    }
    
    public GuitarSpec getSpec(){
        return Spec;
    }

}
