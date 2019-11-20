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
public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINS, OLSON, RYAN,PRS, ANY, UNSPECIFIED;

    @Override
    public String toString() {
        switch(this){
            case FENDER: return "Fender";
            case MARTIN: return "Martin";
            case GIBSON: return "Gibson";
            case COLLINS: return "Collins";
            case OLSON: return "Olson";
            case RYAN: return "Ryan";
            case PRS: return "Prs Guitars";
            case ANY: return "Any Guitars";
            default: return "Unspecified";
        }//end-switch
      
    }
    public static Builder to2(String test) {
        switch(test){
            case "FENDER": return FENDER;
            case "MARTIN": return MARTIN;
            case "GIBSON": return GIBSON;
            case "COLLINS": return COLLINS;
            case "OLSON": return OLSON;
            case "RYAN": return RYAN;
            case "PRS": return PRS;
            case "ANY": return ANY;
            default: return UNSPECIFIED;
        }
    }//end-switch
}
