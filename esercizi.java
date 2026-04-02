
import java.util.*;
public class esercizi{
    //attributi
    public String nome;
    public String colore;
    public int eta;
    //Costruttore vuoto
    public esercizi(){}
    //Costruttore parametrizzato
    public esercizi(String nome,String colore,int eta){
        this.nome=nome;
        this.colore=colore;
        this.eta=eta;
        }
    //Metodo per visualizzare i risultati
    public void StampaRisultati(){
    System.out.println(" L' utente si chiama"+" "+nome+" "+" ha "+" "+eta+" "+"anni,e il suo colore preferito è il "+" "+colore);
    }
   public static void main(String[]args){
       
       esercizi utente1=new esercizi();
       Scanner input=new Scanner (System.in);
       System.out.println("Inserisci il tuo nome");
       utente1.nome=input.next();
       
       System.out.println("Inserisci la tua eta ");
       utente1.eta=input.nextInt();
       
       System.out.println("Inserisci l il tuo colore preferito");
       utente1.colore=input.next();
       
       utente1.StampaRisultati();
   } 
}
