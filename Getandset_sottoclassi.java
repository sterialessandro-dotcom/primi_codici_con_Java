import java.util.*;

public class Veicolo {
    private String targa;
    private String marca;
    private double costoGiornaliero;

    public Veicolo() {}
    public Veicolo(String targa, String marca, double costoGiornaliero) {
        this.targa = targa;
        this.marca = marca;
        this.costoGiornaliero = costoGiornaliero;
    }

    public void settarga(String targa) { this.targa = targa; }
    public void setmarca(String marca) { this.marca = marca; }
    public void setcostoGiornaliero(double costo) { this.costoGiornaliero = costo; }

    public String gettarga() { return targa; }
    public String getmarca() { return marca; }
    public double getcostoGiornaliero() { return costoGiornaliero; }

    public double calcolaPreventivo(int giorni) {
        return costoGiornaliero * giorni;
    }

    public void MostraDati() {
        // Qui usiamo le variabili dirette: semplice e pulito
        System.out.println("Targa: " + targa + " | Marca: " + marca + " | Costo GG: " + costoGiornaliero);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Test Veicolo
        Veicolo v0 = new Veicolo("H725", "Audi", 75);
        v0.MostraDati();
        System.out.println("Inserire i giorni noleggio:");
        int giorni = input.nextInt();
        System.out.println("Costo totale: " + v0.calcolaPreventivo(giorni) + " €");

        // Test Furgone
        System.out.println("\n--- FURGONE ---");
        Furgone f1 = new Furgone("Ca23", "Ferrari", 800, 3000);
        f1.MostraDati();
        System.out.println("Inserire i giorni noleggio furgone:");
        giorni = input.nextInt();
        System.out.println("Costo totale (con carico): " + f1.calcolaPreventivo(giorni) + " €");
    }
}

class Furgone extends Veicolo {
    private int capacitaCarico;

    public Furgone(String targa, String marca, double costo, int capacitaCarico) {
        super(targa, marca, costo);
        this.capacitaCarico = capacitaCarico;
    }

    public void setcapacitaCarico(int cap) { this.capacitaCarico = cap; }
    public int getcapacitaCarico() { return capacitaCarico; }

    @Override
    public double calcolaPreventivo(int giorni) {
        double base = super.calcolaPreventivo(giorni);
        if (capacitaCarico > 1000) {
            base += 50;
        }
        return base;
    }

    @Override
    public void MostraDati() {
        super.MostraDati();
        System.out.println("Capacità di carico: " + capacitaCarico + " kg");
    }
}
