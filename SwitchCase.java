import java.util.*;
public class Main {
    public static void main(String[]args){
        System.out.println(" Fai una scelta");
        System.out.println("Inserisci 1 per l' inverno");
        System.out.println(" Inserisci 2 per la primavera");
        System.out.println("Inserisci 3 per l' estate");
        System.out.println(" Inserisci 4 per l' autunno");
        //
        Scanner tastiera=new Scanner(System.in);
        int scelta=tastiera.nextInt();
        //Switch case
        switch(scelta)//il valore di scelta determinerà il case 
        {
            case 1 :System.out.println("Hai scelto l' inverno");break;
            case 2 :System.out.println("Hai scelto l' primavera");break;
            case 3 :System.out.println("Hai scelto l' estate");break;
            case 4 :System.out.println("Hai scelto l' autunno");break;
            default :System.out.println("Scelta non valida");
        }
        
        
    }
  
    
    
    
}
