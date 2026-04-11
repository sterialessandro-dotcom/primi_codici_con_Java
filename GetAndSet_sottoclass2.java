import java.util.*;

public class Veicolo {
    // Attributi
    private String targa;
    private String marca;
    private double costoGiornaliero;

    // Costruttore vuoto
    public Veicolo() {}

    // Costruttore parametrizzato
    public Veicolo(String targa, String marca, double costoGiornaliero) {
        this.targa = targa;
        this.marca = marca;
        this.costoGiornaliero = costoGiornaliero;
    }

    // Metodi SET
    public void settarga(String targa) {
        this.targa = targa;
    }
    public void setmarca(String marca) {
        this.marca = marca;
    }
    public void setcostoGiornaliero(double costoGiornaliero) {
        this.costoGiornaliero = costoGiornaliero;
    }

    // Metodi GET
    public String gettarga() {
        return targa;
    }
    public String getmarca() {
        return marca;
    }
    public double getcostoGiornaliero() {
        return costoGiornaliero;
    }

    // Metodo calcola preventivo
    public double calcolaPreventivo(int giorni) {
        double risultato = getcostoGiornaliero() * giorni;
        return risultato;
    }

    // Metodo visualizza dati (CON I GET COME RICHIESTO)
    public void MostraDati() {
        System.out.println("targa: " + gettarga() + " | marca: " + getmarca() + " | costogiornaliero: " + getcostoGiornaliero());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Oggetto super classe
        Veicolo v0 = new Veicolo();
        v0.settarga("H725");
        v0.setmarca("Audi");
        v0.setcostoGiornaliero(75);
        v0.MostraDati();

        System.out.println(" Inserire i giorni Ale");
        int giorniscelti = input.nextInt();
        double costi = v0.calcolaPreventivo(giorniscelti);
        System.out.println("Il costo totale è " + costi + " €");

        // Oggetto sottoclasse
        Furgone f1 = new Furgone("Ca23", "Ferrari", 800, 0);
        f1.setcapacitaCarico(3000);
        f1.MostraDati();

        System.out.println(" Inserire i giorni furgone");
        int giornifurgone = input.nextInt();
        double costifurgone = f1.calcolaPreventivo(giornifurgone);
        System.out.println("Il costo totale scelto in base alla capacita di carico è " + costifurgone + " €");
    }
} // Chiusura Veicolo

class Furgone extends Veicolo {
    // Attributi sottoclasse
    private int capacitaCarico;

    // Costruttore sottoclasse
    public Furgone(String targa, String marca, double costoGiornaliero, int capacitaCarico) {
        super(targa, marca, costoGiornaliero);
        this.capacitaCarico = capacitaCarico;
    }

    // Metodo SET
    public void setcapacitaCarico(int capacitaCarico) {
        this.capacitaCarico = capacitaCarico;
    }

    // Metodo GET
    public int getcapacitaCarico() {
        return capacitaCarico;
    }

    @Override
    public double calcolaPreventivo(int giorni) {
        double base = super.calcolaPreventivo(giorni);
        if (getcapacitaCarico() > 1000) {
            base += 50;
        }
        return base;
    }

    @Override
    public void MostraDati() {
        super.MostraDati();
        System.out.println("Questo è il sovracarico: " + getcapacitaCarico());
    }
} // Chiusura Furgone
