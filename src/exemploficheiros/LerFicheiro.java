
package exemploficheiros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LerFicheiro {
    ArrayList<Alumno> lista = new ArrayList();
 public void lerFich(String nomeFich){     
     Scanner sc= null;
     try {
       File f = new File(nomeFich);
         sc = new Scanner(f);
         // tamen : sc = new Scanner(new File(nomeFich));
        while(sc.hasNextLine()){
            String res = sc.nextLine();
            System.out.println(res);
          // tamen:  System.out.println(sc.nextLine());
        } 
     
     } catch (FileNotFoundException ex) {
         System.out.println("erro1 "+ ex.toString());
 }
    finally{
         sc.close();
     }
 }
    public void lerDatoFich(String nomFich){
     Scanner ler= null;
     try {
         ler = new Scanner(new File(nomFich)).useDelimiter("\\s*,\\s*");
          while(ler.hasNext()){
             System.out.println("**"+ ler.next());
          }
          } catch (FileNotFoundException ex) {
         System.out.println("erro2 "+ ex.getMessage()); 
                   
         }    
     
    finally{
       if(ler != null)
           ler.close();
     }   
        
      
    } 
   public void lerNumeros(String nomFich){
     Scanner ler= null;
     try {
         ler = new Scanner(new File(nomFich)).useDelimiter("\\s*,\\s*");
          while(ler.hasNextInt()){
             System.out.println("*"+ ler.nextInt());
          }
          } catch (FileNotFoundException ex) {
         System.out.println("erroNumeros "+ ex.getMessage()); 
                   
         }    
     
    finally{
       if(ler != null)
           ler.close();
     }
        
   }       
  public ArrayList<Alumno> lerRexistros(String nomeFich){     
     Scanner sc= null;
     
     try {
       File f = new File(nomeFich);
         sc = new Scanner(f);        
        while(sc.hasNextLine()){
            String res = sc.nextLine();
            String[]datos = res.split(",");
            lista.add(new Alumno(datos[0],datos[1],Integer.parseInt(datos[2])));            
        } 
     
     } catch (FileNotFoundException ex) {
         System.out.println("erro1 "+ ex.toString());
 }
    finally{
         sc.close();
     }
     return lista;
 }
  public void amosar(){
      System.out.println(lista);
  }
public void lerEscribirFich(String nomeFichLer,String nomeFichEscribir){     
     Scanner sc= null;
      PrintWriter p= null;
     try {
       File l = new File(nomeFichLer);
       File es = new File(nomeFichEscribir);
         sc = new Scanner(l);
        p= new PrintWriter(es);
        
        while(sc.hasNextLine()){
            String res = sc.nextLine();            
          String[]dato=res.split(",");
         if(Integer.parseInt(dato[2])%2==0)
            p.println(dato[0]+","+dato[1] + ","+dato[2]);
        } 
     
     } catch (FileNotFoundException ex) {
         System.out.println("erro1 "+ ex.toString());
 }
    finally{
         sc.close();
     }
 }  

   
   
   
   
   
   
   
   
   
   
        
        
 
}
