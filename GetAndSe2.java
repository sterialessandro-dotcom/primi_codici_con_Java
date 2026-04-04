import java.util.*;
public class Prodotto{
    //attributi
    private String nome;
    private double prezzo;
    private int quantita;
    //metodo costruttore vuoto
    public Prodotto(){}
    //metodo costruttore parametrizzato
    public Prodotto(String nome,double prezzo,int quantita){
        this.nome=nome;
        this.prezzo=prezzo;
        this.quantita=quantita;
        }
        
    //metodi set
    
    public   void setNome(String name){
        this.nome=name;
    }
        public  void  setPrezzo(double price){
        this.prezzo=price;
    }
    
        public   void setQuantita(int numbers){
        this.quantita=numbers;
        }
        
        
          //metodi get(lettura dopo il set)
          
    public String getNome(){
        return nome;
    }
     public double getPrezzo(){
        return prezzo;
    }
     public int getQuantita(){
        return quantita;
    }
    //metodo per visualizzare i dati
    public void VisualizzaDettagli(){
        System.out.println("Visualizza i dettagli  del prodotto"+" "+"nome"+" "+getNome()+" "+"prezzo"+" "+getPrezzo()+" "+"numero pezzi"+" "+getQuantita());//per visualizzare posso usare anche il set()
}
//Metodo per la gestione del magazzino
public void ControlloMagazzino(){
    System.out.println("La quantità è inferiore al deposito ed è di"+" "+getQuantita());
 if ( getQuantita() <30){
setQuantita(getQuantita()+(30-getQuantita()));//Il set puo ricevere assegnazioni mentre il get puo essere usato in un calcolo ma non ricevere assegnazioni di risultati
      //oppure semplicemente invece di:Setquantita(GetQuantita+(30-GetQuantita));//posso scrivere direttamente SetQuantita(30);
      System.out.println("Adesso la quantita è di nuovo la minima di deposito");
}
else{
System.out.println("La quantita è  la minima di deposito");
}

}
    
    public static void main(String[]args){
        //primo oggetto con costruttore vuoto
        Prodotto p1=new Prodotto();
        p1.setNome("tastiera");
        p1.setPrezzo(40.5);
        p1.setQuantita(10);
        //Visualizza 
        System.out.println("Prodotto"+" "+p1.getNome());
        System.out.println("Prodotto"+" "+p1.getPrezzo());
        System.out.println("Prodotto"+" "+p1.getQuantita());
        //secondo oggetto con costruttore vuoto
        Prodotto p2=new Prodotto();
        p2.setNome(" smartphone");
        p2.setPrezzo(280.5);
        p2.setQuantita(20);
        p2.VisualizzaDettagli();
//terzo oggetto con costruttore paramettrizzato
 Prodotto p3=new Prodotto("sconosciuto",0.0,0);
Scanner input=new Scanner(System.in);
        System.out.println("Inserisci di che prodotto si tratta");
        p3.setNome(input.nextLine());
    System.out.println("Inserisci il prezzo del prodotto");
        p3.setPrezzo(input.nextDouble());
                input.nextLine();
        System.out.println("Inserisci il  la quantita");
        p3.setQuantita(input.nextInt());
                        input.nextLine();
                 p3.VisualizzaDettagli();
                 //quarto oggetto con costrutttore paramettrizzato
                 Prodotto p4=new Prodotto("sconosciuto",0.0,0);
                 System.out.println("Inserisci di che tipo di prodotto si tratta");
                 p4.setNome(input.nextLine());
                 System.out.println("Inserisci il prezzo");
                 p4.setPrezzo(input.nextDouble());
                 input.nextLine();
                 System.out.println("Inserisci la quantita");
                 p4.setQuantita(input.nextInt());
                 input.nextLine();
                 p4.VisualizzaDettagli();
                 p4.ControlloMagazzino();
    p4.VisualizzaDettagli();
    
}
}
