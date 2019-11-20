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
public class GuitarSpec {
    //Commom Attributes
    private String Model;
    private Builder Builder;
    private Type Type;
    private Wood backWood;
    private Wood topWood;
    private enumStrings numStrings;

    public GuitarSpec(String Model, Builder Builder,
                      Type Type, Wood backWood, 
                      Wood topWood, enumStrings numStrings) {
        this.Model = Model;
        this.Builder = Builder;
        this.Type = Type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
    }

    
    public Builder getBuilder() {
        return Builder;
    }

    public String getModel() {
        return Model;
    }

    public Type getType() {
        return Type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public enumStrings getNumStrings(){
        return numStrings;
    }
    //Delegation of Matches
    public boolean matches(GuitarSpec otherSpec){
        if(Builder!=otherSpec.getBuilder())
            return false;
        if(!Model.toLowerCase().equals(otherSpec.getModel().toLowerCase()))
            return false;
        if(Type!=otherSpec.getType())
            return false;
        if(backWood!=otherSpec.getBackWood())
            return false;
        if(topWood!=otherSpec.getTopWood())
            return false;
        if(numStrings!=otherSpec.getNumStrings())
            return false;
        //The otherSpec is equal
        return true;
    }
    
    
}
