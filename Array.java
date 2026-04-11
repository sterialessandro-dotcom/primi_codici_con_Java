import java.util.*;
public class ArrayExample{

    
    public static void main(String[]args){
        Scanner input =new Scanner (System.in);
        int ar[]=new int [5];
        int ar2[]={3,5,7,8,10};
    for (int i=0;i<5;i++){
        System.out.println("Inserisci il numero dell'Array");
        ar[i]=input.nextInt();
        System.out.println("Hai inserito il numero"+" "+ar[i]);
    }    
        for (int i=0;i<5;i++){
       
        System.out.println("Hai inserito il numero"+" "+ar2[i]);
    }    
        
        
        
    }
    
}
