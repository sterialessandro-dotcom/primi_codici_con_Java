import java.util.*;
public class Materiali_edili{
    //attributi 
     protected String tipo;
     protected double peso;
     protected double metri_cubi;
     //costruttore vuoto
     public Materiali_edili(){};
     //costruttore parametrizzato
     public Materiali_edili(String tipo,double peso,double metri_cubi){
         this.tipo=tipo;
         this.peso=peso;
         this.metri_cubi=metri_cubi;
      }
     public void PesoMetroCubo(){
         double mc=peso/metri_cubi;
         System.out.println("Il peso al metro cubo di"+" "+tipo+" "+"e' di"+" "+mc);
         }
    public void VisualizzaDettagli(){
        System.out.println("Tipo materiale"+" "+tipo+" "+" peso"+" "+peso+""+" "+metri_cubi);
        
    }
     public static void main (String[]args){
         Scanner input=new Scanner(System.in);
         Materiali_edili m1=new Materiali_edili();
         System.out.println("Inserisci il tipo");
         m1.tipo=input.nextLine();
                  System.out.println("Inserisci il peso totale");

         m1.peso=input.nextDouble();
                  System.out.println("Inserisci i metri cubi");

         m1.metri_cubi=input.nextDouble();
         
         m1.PesoMetroCubo();
         m1.VisualizzaDettagli();
     }
     
     
     
     
}
