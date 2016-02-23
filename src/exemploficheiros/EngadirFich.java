
package exemploficheiros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EngadirFich {
    public void engadir(String nomeFich, String dato){
       
            FileWriter fw = null;
            PrintWriter esc = null;
        try{    
            fw = new FileWriter(nomeFich,true);
            esc = new PrintWriter(fw);
            esc.append("\n");
            esc.append(dato);
        } catch (IOException ex) {
            System.out.println("erro engadir"+ ex.getMessage());
        }
        finally{
                try {
                    if(fw!=null)
                        fw.close();
                    if(esc!= null)
                       esc.close();
                } catch (IOException ex) {
                    System.out.println("erro de peche"+ex.getMessage());
                }
        }            
    } 
}

