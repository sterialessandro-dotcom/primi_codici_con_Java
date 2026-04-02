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
    //Metodo Stampa
    public void Stampa(){
        System.out.println("Modello :" + "  "+modello+" "+ "prezzo:"+"  "+"è un 5G?"+" "+is5G);
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
       
       cel1.Stampa();

        
    }
    
    
    
    
    
    
    
    
}
