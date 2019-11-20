package guitarstore;

public class ListMenu {
    private Builder[] build;
    private Type[] type;
    private Wood[] wood;
    private enumStrings[] string;
    

    public ListMenu() {
        build = Builder.values();
        type = Type.values();
        wood = Wood.values();
        string = enumStrings.values();
        LoggerApp.getInstance(" - menu successfully listed ", "");
    }
    
    public void getBuilder(){
        for (int i = 0; i < build.length; i++) {
            System.out.println(build[i]+"-"+i); 
        }
        LoggerApp.getInstance(" - construction company successfully sought ", "");
    }
    public Builder getBuilder(int select){
        LoggerApp.getInstance(" - search builder with index ", "");
        return build[select];
    }
    
    public void getType(){
        for (int i = 0; i < type.length; i++) {
            System.out.println(type[i]+"-"+i); 
        }
        LoggerApp.getInstance(" - type successfully caught ", "");
    }
    public Type getType(int select){
        LoggerApp.getInstance(" - search type with index ", "");
        return type[select];
    }
    
    public void getWood(){
        for (int i = 0; i < wood.length; i++) {
            System.out.println(wood[i]+"-"+i); 
        }
        LoggerApp.getInstance(" - wood successfully caught ", "");
    }
    public Wood getWood(int select){
        LoggerApp.getInstance(" - search wood with index ", "");
        return wood[select];
    }
    
    public void getStrings(){
        for (int i = 0; i < string.length; i++) {
            System.out.println(string[i]+"-"+i); 
        }
        LoggerApp.getInstance(" - string successfully caught ", "");
    }
    public enumStrings getStrings(int select){
        LoggerApp.getInstance(" - search string with index ", "");
        return string[select];
    }
}
