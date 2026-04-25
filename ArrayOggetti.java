public class Auto{
    //Attributi
    public String marca;
    public int cilindrata;
    //costruttore
    public Auto(String marca,int cilindrata){
        this.marca=marca;
        this.cilindrata=cilindrata;
    }
    //metodo mostra dati
    public void MostraDati(){
        System.out.println("L'auto è"+" "+marca+" ed è di cilindrata "+" "+cilindrata);
    }
public static void main (String[]args){
    Auto garage[]=new Auto[3];
    garage[0]=new Auto ("Ferrari",3000);
    garage[0].MostraDati();
    garage[1]=new Auto ("BYD",2000);
    garage[1].MostraDati();
    garage[2]=new Auto("Audi",2000);
    garage[2].MostraDati();
    
    
}
}
