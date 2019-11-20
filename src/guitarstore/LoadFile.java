package guitarstore;

import java.io.BufferedReader;
import java.io.FileReader;

public class LoadFile {
    private String numSerie,price,builder,model,type,backwood,topwood, numString;
    public void LerArquivo(Inventory inv) throws Exception{
        
        FileReader fr = new FileReader("arquivo.txt");
        BufferedReader buff = new BufferedReader(fr);
        LoggerApp.getInstance(" - file successfully read ", "");
        String line;
        String[] word;
        do{
            line = buff.readLine();
            if(line !=null){
                word = line.split(",");
                numSerie = word[0];
                price = word[1];
                builder = word[2];
                model = word[3];
                type = word[4];
                backwood = word[5];
                topwood = word[6];
                numString = word[7];
                inv.addGuitar(numSerie, Double.parseDouble(price),Builder.valueOf(builder),
                model,Type.valueOf(type),Wood.valueOf(backwood),Wood.valueOf(topwood),
                enumStrings.valueOf(numString));        
            }
        }while(line != null);
    }
}