import java.util.*;
public class Prodotto{
    //attributi
    private double prezzoAlPubblico;
    private String nome;
    //Costruttore parametrizzato
    Prodotto( String nome,double prezzoAlPubblico){
        this.nome=nome;
        this.prezzoAlPubblico=prezzoAlPubblico;
    }
    //Costruttore vuoto
    Prodotto(){}
    //metodo set 
    public  void setprezzoAlPubblico( double prezzoAlPubblico){
        if(prezzoAlPubblico<0.50){
           this.prezzoAlPubblico=0.50;
            System.out.println("Il prezzo dovra partire da un minimo di 0.50€");
        }
        else {this.prezzoAlPubblico=prezzoAlPubblico;
        }
    }
    public void setnome(String nome){
        this.nome=nome;
    }
    //metodo get
    public double getprezzoAlPubblico (){
        return prezzoAlPubblico;
    }
    
    public String getnome(){
        return nome;
    }
    //metodo per visualizzare i dati
    public void visualizzaDati(){
        System.out.println("Prodotto:"+" "+getnome()+" "+"prezzo:"+" "+getprezzoAlPubblico());
        
    }
    public static void main(String[]args){
        //oggetto con costruttore paramettrizzato
        Prodotto pr1=new Prodotto("smartwatch",255.0);
        pr1.visualizzaDati();
        
        //oggetto con il costruttore vuoto;
        Scanner in=new Scanner(System.in);
        Prodotto pr2=new Prodotto();
        System.out.println("Inserisci che prodotto è :");
        pr2.nome=in.nextLine();
        System.out.println("Inserisci il prezzo :");
        pr2.setprezzoAlPubblico(in.nextDouble());
        pr2.visualizzaDati();
    }
    
}
//sottoclasse
    class Caffe extends Prodotto{
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
