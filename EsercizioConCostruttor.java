    import java.util.*;

public class Smartphone{
    //attributi
    public String modello;
    public double prezzo;
    public boolean is5G;
    //Metodo costruttore parametrizzato
    public Smartphone(String modello,double prezzo,boolean is5G){
        this.modello=modello;
        this.prezzo=prezzo;
        this.is5G=is5G;
        }
        //Metodo costruttore vuoto
        public Smartphone(){}
        //Metodo Sconto
        public double Sconto(){
            double prezzo_scontato=prezzo-(prezzo/100*10);
            return prezzo_scontato;
        }
    //Metodo Stampa
    public void Stampa(){
        System.out.println("Modello :" + "  "+modello+" "+ "prezzo:"+"  "+ prezzo +"è un 5G?"+" "+is5G+" "+"il prezzo scontato è invece"+" "+Sconto());
    }
    //Main
    public static void main(String[]args){
        Smartphone cel1=new Smartphone("Sconosciuto",0,false);
        Scanner input=new Scanner (System.in);
        
        System.out.println("Inserire il modello");
        cel1.modello=input.nextLine();
        
                System.out.println("Inserire il prezzo");
               cel1.prezzo=input.nextDouble();
               
        System.out.println("Inserire se è vero o no che è un 5G");
       cel1.is5G=input.nextBoolean();
       cel1.Sconto();
              cel1.Stampa();
    //"Pulisci buffer"
       input.nextLine();
       //secondo oggetto
       Smartphone cel2=new Smartphone("Sconosciuto",0,false);
        System.out.println("Inserire il modello");
        cel2.modello=input.nextLine();
        
                System.out.println("Inserire il prezzo");
               cel2.prezzo=input.nextDouble();
               
        System.out.println("Inserire se è vero o no che è un 5G");
       cel2.is5G=input.nextBoolean();
       cel2.Sconto();
       cel2.Stampa();
       //"Pulisci buffer"
       input.nextLine();
       
       Smartphone cel3=new Smartphone();
       
               System.out.println("Inserire il modello");
cel3.modello=input.nextLine();
       
               System.out.println("Inserire il prezzo");
cel3.prezzo=input.nextDouble();

        System.out.println("Inserire se è vero o no che è un 5G");
cel3.is5G=input.nextBoolean();
cel3.Sconto();
cel3.Stampa();
    }
    
    
    
    
    
    
    
    
}
