import java.util.*;
public class Veicolo{
    //attributi
    protected String marca;
    protected String modello;
    protected int anno_produzione;
    //costruttore vuoto
    public Veicolo(){};
    //costruttore paramettrizzato
    public Veicolo(String marca,String modello,int anno_produzione){
        this.marca=marca;
        this.modello=modello;
        this.anno_produzione=anno_produzione;
    }
        //Metodo accensione
        public void Accendi(){
            boolean acceso;
            System.out.println("Inserisci se il veicolo è acceso o no");
            Scanner input=new Scanner (System.in);
            acceso=input.nextBoolean();
            if (acceso==true){
                System.out.println("Il veicolo è  acceso");
                
            }
            else{
                System.out.println("Il veicolo è spento");
            }
        }
        
       public void MostraDettagli(){
           System.out.println("Marca :"+" "+marca +" " +"Modello :"+" "+modello +"  " +"anno di produzione"+" "+anno_produzione);
       }
         public static void main(String[]args){
             Veicolo v1=new Veicolo();
             v1.marca="Audi";
             v1.modello="A6";
             v1.anno_produzione=2020;
             v1.Accendi();
             v1.MostraDettagli();
             //oggetto della sottoclasse Auto
             Auto v2=new Auto();
             v2.marca="Ferrari";
             v2.modello="Luce";
             v2.anno_produzione=2026;
             v2.carburante="elettrico";
             v2.MostraDettagli();
             //Oggetto della sottoclasse Moto
             Moto v3=new Moto( "kawasaki","Ninja",2006,1000);
             v3.Accendi();
             v3.MostraDettagli();
             
             }
}
         
      class  Auto extends Veicolo{
          //attributi sottoclasse
           public String carburante;
          //costruttore
          public  Auto(){};
          //costruttore paramettrizzato
          public Auto(String marca,String modello,int anno_produzione,String carburante){
              super(marca,modello,anno_produzione);
              this.carburante=carburante;
              }
          @Override
          public void  MostraDettagli(){
               super.MostraDettagli();
               System.out.println("carburante"+" "+carburante);
           }
          }  
         class Moto extends Veicolo{
             //attributi classe moto
             public int cilindrata;
             //costruttore vuoto
             public Moto (){};
             //costruttore paramettrizzato
             public Moto (String marca,String modello,int anno_produzione,int cilindrata){
                 super(marca,modello,anno_produzione);
                 this.cilindrata=cilindrata;
             }
             @Override
             public void MostraDettagli(){
                 super.MostraDettagli();
                 System.out.println("cilindrata :"+" "+cilindrata);
             }
             
             
             
         }
         
           
       
        
        
    
    
    
    
    
    
    
    
