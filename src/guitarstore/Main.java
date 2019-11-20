package guitarstore;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    
    private static Builder builder1;
    private static Type type1;
    private static Wood woodf;
    private static Wood woodb;
    private static enumStrings string1;
    private static String model;
    
    public static void main(String[] args) {
        try {
            LoggerApp.getInstance(" - Program Started ", "");
            //Setup Store Inventory
            Inventory inventory = new Inventory();
            //Initializing Inventory 
            LoadFile lf = new LoadFile();
            lf.LerArquivo(inventory);

            ListMenu lm = new ListMenu();
            //User interaction
            Scanner read = new Scanner(System.in);
            System.out.println("\n-> Inform the guitar builder: ");
            lm.getBuilder();
            builder1 = lm.getBuilder(read.nextInt());
            
            System.out.println("\n-> Inform the guitar type: ");
            lm.getType();
            type1 = lm.getType(read.nextInt());
            
            System.out.println("\n-> Inform the guitar front wood: ");
            lm.getWood();
            woodf = lm.getWood(read.nextInt());
            
            System.out.println("\n-> Inform the guitar back wood: ");
            lm.getWood();
            woodb = lm.getWood(read.nextInt());
            
            System.out.println("\n-> Inform the guitar strings: ");
            lm.getStrings();
            string1 = lm.getStrings(read.nextInt());
            
            System.out.println("\n-> Inform the guitar model: ");
            model = read.next();
            
            //lm.getBuilder(read.nextInt());

            //Guitar SPEC to Search for client
            GuitarSpec searchSpec = new GuitarSpec(model, builder1, type1,
                    woodf, woodb, string1);
            ArrayList<Guitar> foundGuitarArr = inventory.Search(searchSpec);
            if (!foundGuitarArr.isEmpty()) {
                System.out.println("You might like this Guitar(s)");
                for (Guitar foundGuitar : foundGuitarArr) {
                    GuitarSpec foundSpec = foundGuitar.getSpec();
                    System.out.println("Builder:" + foundSpec.getBuilder());
                    System.out.println("Model:" + foundSpec.getModel());
                    System.out.println("Type:" + foundSpec.getType());
                    System.out.println("Top Wood:" + foundSpec.getTopWood());
                    System.out.println("Back Wood:" + foundSpec.getBackWood());
                    System.out.println("Number of Strings:" + foundSpec.getNumStrings().getValue());
                    System.out.println("You can have it for only ($):" + foundGuitar.getPrice());
                }
            } else {
                System.out.println("Sorry we don't have anything for you!");
            }
        } catch (Exception ex) {
            LoggerApp.getInstance(" - Program Exception ", ex.getMessage());
        }finally{
            LoggerApp.getInstance(" - Program Finished \n", "");
        }
    }
}