import java.util.*;
public class ContoBancario{
    //attributi 
    protected String titolare;
    protected double saldo;
    //costruttore vuoto
    public ContoBancario(){}
    //costruttore parametrizzato
    public ContoBancario(String titolare,double saldo){
        this.titolare=titolare;
        this.saldo=saldo;
        }
    //Metodo per aggiornare il saldo
    public void AggiornaSaldo(){
        final double LIMITE =0;
        Scanner in= new Scanner(System.in);//lo scanner si puo passare anche come parametro
        if (saldo<=LIMITE){
        System.out.println("Il tuo saldo deve essere ricaricato");
        saldo=in.nextDouble();
        }else
        {System.out.println("Il tuo saldo va bene");
        }
    }
        //Metodo per visualizzare i dati
        public void MostraDati(){
            System.out.println("Il titolare del conto si chiam"+" "+titolare+" "+" e nel conto ci sono:"+" "+saldo+" "+"€");
            
        }
        public static void main(String[]args){
            //costruttore vuoto
            ContoBancario cliente1=new ContoBancario();
            
            cliente1.titolare="Alex";
            cliente1.saldo=1200.0;
            cliente1.AggiornaSaldo();
            cliente1.MostraDati();
            
            //costruttore parametrizzato
            ContoBancario cliente2 =new ContoBancario(" Marco",0.0);
            cliente2.AggiornaSaldo();
            cliente2.MostraDati();
            
            //Costruttore paramettrizzato della sottoclasse
            ContoRisparmio cliente3=new ContoRisparmio("Carlo",1500.0,0.1);
            cliente3.MostraDati();
        }
        
}
class ContoRisparmio extends ContoBancario {
        //attributi 
        protected double tassoInteresse;
        //costruttore vuoto
        public ContoRisparmio(){}
        //costruttore paramettrizzato
        public ContoRisparmio(String titolare,double saldo,double tassoInteresse){
          super(titolare,saldo);
            this.tassoInteresse=tassoInteresse;
             }
             //metodo per calcolare il tassso di interesse su base annua(dececennale) con incremento
             public void calcolaTassoInteresse(){
                 int anni=10;
                 tassoInteresse=0.02;
                 for (int i=0;i<=anni;i++){
                     System.out.println("Il tasso aumentera il conto del 20%");
                     saldo=saldo+(saldo*tassoInteresse);
                     System.out.println("Il saldo attuale è"+" "+saldo);
                 }
                 
             }
        
        @Override//In pratica ovveride sovrascrive
        public void MostraDati(){//richiamo il metodo dalla classe madre
        super.MostraDati();
        //aggiungo i dati della classe figlio
            System.out.println("Il saldo attuale e" +" " +(saldo+(saldo*tassoInteresse)));
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
