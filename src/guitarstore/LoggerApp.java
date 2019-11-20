package guitarstore;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Timestamp;

public class LoggerApp {
    
    private static LoggerApp instance;
    private static String file = "C:\\LogsJava\\teste.txt";
    private static PrintWriter pw;
    private static String logg;
    private static String error;
    
    private LoggerApp(){
    }
    
    public static LoggerApp getInstance(String log, String err){ // Em aplicações multi-threads, o singleton deve ser sincronizado, ou corre-se o risco de criar várias instâncias.
        if (instance == null){
            instance = new LoggerApp();
        }
        //new Timestamp(System.currentTimeMillis()) + log + err
        logg = log;
        error = err;
        writFile();
        
        return instance;
    }
    
    public static void writFile(){
        try{
            
            pw = new PrintWriter (new BufferedWriter (new FileWriter (file, true)));
            pw.println(new Timestamp(System.currentTimeMillis()) + logg + error);
            pw.close();
        
        }catch(Exception e){
            System.err.println("Error writing file.");
        }
    }
}