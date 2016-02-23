
package exemploficheiros;

import java.io.File;

public class ExemploFicheiros {

    public static void main(String[] args) {
        LerFicheiro obxler= new LerFicheiro();
        EscribirFich obxesc = new EscribirFich();
        EngadirFich obxeng= new EngadirFich();
      //  obxler.lerFich("nomes.txt");
      //  obxler.lerFich("C:\\Users\\nina\\Documents\\NetBeansProjects\\ExemploFicheiros\\nomes.txt");
       // tamen
        obxler.lerFich("C:/Users/nina/Documents/NetBeansProjects/ExemploFicheiros/nomes.txt");
        obxler.lerDatoFich("nomes.txt");
        obxler.lerNumeros("numeros.txt");
        obxler.lerRexistros("alumnos.txt");
        obxler.amosar();
        obxesc.escribir("num.txt");
        obxler.lerEscribirFich("alumnos.txt","notasPares.txt");
        obxeng.engadir("alumnos.txt","rrr,9999,9");
        obxler.lerRexistros("alumnos.txt");  
    }
    
}
