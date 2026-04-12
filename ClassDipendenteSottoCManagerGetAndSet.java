import java.util.*;
public class Dipendente{
    //attributi
    private String nome;
    private String idImpiegato;
    private double pagaOrariaBase;
    //costruttore paramettrizzato
    public Dipendente (String nome,String idImpiegato,double pagaOrariaBase){
        this.nome=nome;
        this.idImpiegato=idImpiegato;
        this.pagaOrariaBase=pagaOrariaBase;
        }
        //costruttore vuoro
        public Dipendente(){}
    //Metodo set
    public  void setnome(String nome){
        this.nome=nome;
    }
    public void  setidimpiegato(String idImpiegato){
        this.idImpiegato=idImpiegato;
    }
    public void setpagaOrariaBase (double pagaOrariaBase){
        this.pagaOrariaBase=pagaOrariaBase;
    }
    //Metodo get
    public String getnome(){
        return nome;
    }
    public String getidImpiegato(){
        return idImpiegato;
    }
    public double getpagaOrariaBase(){
        return pagaOrariaBase;
    }
    //metodo per calcolare lo stipendio
    public double calcolaStipendio( int ore){
        double stipendio=ore*pagaOrariaBase;
        return stipendio;
    }
    //metodo per visualizzare i risulatati
    public void visualizzaDati(){
        System.out.println("Nome:"+" "+getnome()+" "+"ruolo"+getidImpiegato()+" "+"paga base"+getpagaOrariaBase());
    }
    //main
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        //dipendente1
        Dipendente dip1=new Dipendente("Alex","Junior",18.0);
        System.out.println("Inserisci le ore lavorate");
        int stunden=input.nextInt();
        double lon=dip1.calcolaStipendio(stunden);
        dip1.visualizzaDati();
        System.out.println("Lo stipendio è di"+" "+lon+" "+"€");
        //dipendente2
        Dipendente dip2=new Dipendente();
                input.nextLine();

        System.out.println("Inserisci il nome");
        dip2.setnome(input.nextLine());
        System.out.println("Inserisci il ruolo");
        dip2.setidimpiegato(input.nextLine());
        System.out.println("Inserisci la paga oraria");
        dip2.setpagaOrariaBase(input.nextDouble());
        input.nextLine();
        System.out.println("Inserisci le ore lavorate");
        stunden=input.nextInt();
        lon=dip2.calcolaStipendio(stunden);
        dip2.visualizzaDati();
        System.out.println("Lo stipendio è di"+" "+lon+" "+"€");
        //dipendente 3(manager)
        Manager man1=new Manager("Antonio","amministratore delegato",110.0,20000.0);
        input.nextLine();
        System.out.println("Inserisci le ore lavorate");
        stunden=input.nextInt();
        lon=man1.calcolaStipendio(stunden);
        man1.visualizzaDati();
                System.out.println("Lo stipendio è di"+" "+lon+" "+"€");

        
        
        
    }
    }
    class Manager extends Dipendente{
        //attributi
        private double bonusFisso;
        //costruttore paramettrizzato;
        public Manager(String nome,String idimpiegato,double pagaOrariaBase,double bonusFisso){
            super(nome,idimpiegato,pagaOrariaBase);
            this.bonusFisso=bonusFisso;
        }
        //metodo cosrtuttore vuoto
        public Manager (){};
        //metodo set 
        public  void setbonusFisso( double bunusFisso){
            this.bonusFisso=bonusFisso;
        }
        //metodo get
        public double getbonusFisso(){
            return bonusFisso;
        }
        //metodo per calcolare lo stipendio
        @Override
        public double calcolaStipendio( int ore){
            super.calcolaStipendio (ore);
            double stipendio=(ore*getpagaOrariaBase())+getbonusFisso();
        return stipendio;
        }
        //metodo stampa
        @Override public void visualizzaDati(){
            super.visualizzaDati();
            System.out.println("il menager prende il bonus di"+" "+bonusFisso+" "+"in più");
            
            
        }
        
        
    }
