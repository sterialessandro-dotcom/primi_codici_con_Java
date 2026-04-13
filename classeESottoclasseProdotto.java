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
        
    }//main
    public static void main(String[]args){
        //oggetto con costruttore paramettrizzato
        Prodotto pr1=new Prodotto("smartwatch",255.0);
        pr1.visualizzaDati();
        
        //oggetto con il costruttore vuoto;
        Scanner in=new Scanner(System.in);
        Prodotto pr2=new Prodotto();
        System.out.println("Inserisci che prodotto è :");
        pr2.setnome(in.nextLine());
        System.out.println("Inserisci il prezzo :");
        pr2.setprezzoAlPubblico(in.nextDouble());
        pr2.visualizzaDati();
        
        //oggetto sottoclasse con costruttore paramettrizzato
        Caffe coffe1 =new Caffe ("caffe Suerte",10.0,3,true);
        coffe1.visualizzaDati();
    }
    
}
//sottoclasse
    class Caffe extends Prodotto{
     //attributi 
     private int gradoTostatura;
     private boolean isMacchiato;
      //costruttore  paramettrizzato della sottoclasse
      public Caffe(String nome,double prezzoAlPubblico,int gradoTostatura,boolean isMacchiato){
    super(nome,prezzoAlPubblico);
    setgradoTostatura(gradoTostatura);
    this.gradoTostatura=gradoTostatura;
    this.isMacchiato=isMacchiato;
    }
    //costruttore vuoto
    public Caffe (){}
    //metodo set
    public void setgradoTostatura(int gradoTostatura){
        int temperatura;
        int ore;
        Scanner input=new Scanner(System.in);
        do{
        
        System.out.println("Inserisci la temperatura ideale(così non lo è");
        temperatura=input.nextInt();
        input.nextLine();
        System.out.println("Inserisci quante ore retserà in tostatura");
        ore=input.nextInt();
        }
        while(ore!=24 || temperatura !=70);
        System.out.println("Adesso il caffe risulta tostato bene");
        
        }
        public  void setisMacchiato(boolean isMacchiato){
            this.isMacchiato=isMacchiato;
        }
    //metodi get
    public int getgradoTostatura(){
        return gradoTostatura;
    }
    public boolean getisMacchiato (){
        return isMacchiato;
    }
    //Sovrascrivo il metodo di stampa dei dati
    @Override
    public void visualizzaDati(){
        super.visualizzaDati();
        System.out.println("Il caffe è tostato ad un livello"+" "+getgradoTostatura()+" "+ " ed è macchiato"+" "+getisMacchiato());
    }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
