public class Prodotto{
    //attributi
    private String nome;
    private double prezzo;
    private int quantita;
    //metodo costruttore vuoto
    public Prodotto(){}
    
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
        System.out.println("Visualizza i dettagli  del prodotto"+" "+"nome"+" "+getNome()+" "+"prezzo"+" "+getPrezzo()+" "+"numero pezzi"+" "+getQuantita());
}
    
    public static void main(String[]args){
        //primo oggetto
        Prodotto p1=new Prodotto();
        p1.setNome("tastiera");
        p1.setPrezzo(40.5);
        p1.setQuantita(10);
        //Visualizza 
        System.out.println("Prodotto"+" "+p1.getNome());
        System.out.println("Prodotto"+" "+p1.getPrezzo());
        System.out.println("Prodotto"+" "+p1.getQuantita());
        //secondo oggetto
        Prodotto p2=new Prodotto();
        p2.setNome(" smrtphone");
        p2.setPrezzo(280.5);
        p2.setQuantita(20);
        p2.VisualizzaDettagli();

    }


    
    
}
