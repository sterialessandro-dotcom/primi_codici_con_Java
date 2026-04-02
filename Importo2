import java.util.*;
public class ContoCorrente{
    //attributi
    public String titolare;
    public double saldo;
    //costruttore vuoto
    public  ContoCorrente(){
        titolare="sconosciuto";
        saldo=100.0;
}
        //metodo deposita
public double Deposita(){
    System.out.println("Inserisci l' importo");
        Scanner input=new Scanner(System.in);
       double  importo=input.nextDouble();
        saldo=saldo+importo;
        return saldo;
}
//metodo Stampa
public void Stampa(){
System.out.println(" Il titolare è"+" "+titolare+" "+"il saldo attuale è di euro:"+" "+saldo) ;   
    
}  
    


    public static void main(String[]args){
     ContoCorrente c1=new ContoCorrente();
     c1.titolare="Alessandro";
     c1.Deposita();
     c1.Stampa();   
        
        
    }
    
} 
    
    
