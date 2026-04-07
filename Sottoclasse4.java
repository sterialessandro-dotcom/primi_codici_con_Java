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
         //oggetto della superclasse con costruttore vuoto e mediante scanner
         Materiali_edili m1=new Materiali_edili();
         System.out.println("Inserisci il tipo");
         m1.tipo=input.nextLine();
                  System.out.println("Inserisci il peso totale");

         m1.peso=input.nextDouble();
                  System.out.println("Inserisci i metri cubi");
         m1.metri_cubi=input.nextDouble();
         m1.PesoMetroCubo();
         m1.VisualizzaDettagli();
         //oggetto della sottoclasse con costruttore paramettrizzato
         MaterialiPerInterni m2=new MaterialiPerInterni("calce",1000,222,100);
         m2.PesoMetroCubo();
         m2.VisualizzaDettagli();
         //oggetto della sottoclasse con costruttore vuoto
         MaterialiPerInterni m3=new MaterialiPerInterni();
         System.out.println("Inserisci il tipo ");
         input.nextLine();
         m3.tipo=input.nextLine();
         System.out.println("Inserisci il peso totale");
         m3.peso=input.nextDouble();
         System.out.println("Inserisci i metri cubi");
         m3.metri_cubi=input.nextDouble();
         System.out.println("Inserisci la durata");
         m3.durata=input.nextDouble();
         m3.PesoMetroCubo();
         m3.VisualizzaDettagli();
     }
    }
    //sottoclasse
    class MaterialiPerInterni extends Materiali_edili{
        //attributi della sottoclasse
        public double durata;
        //costruttore vuoto
        public MaterialiPerInterni(){};
        //Costruttore parametrizzato
        public MaterialiPerInterni(String tipo,double peso,double metri_cubi,double durata){
            super(tipo,peso,metri_cubi);
            this.durata=durata;
            }
        @Override public  void PesoMetroCubo(){
        super.PesoMetroCubo();
        };
        @Override public void VisualizzaDettagli(){
            super.VisualizzaDettagli();
            System.out.println("La durata del materiale è"+" "+durata+" "+"anni");
        }
        
        
        
    }
