package gianlucamessina.BE_U2_S1_L2.entities;

public class Bevanda extends Alimento{
    private double quantita;

    public Bevanda(String nome, int calorie, double prezzo, double quantita) {
        super(nome, calorie, prezzo);
        this.quantita = quantita;
    }

    public double getQuantita() {
        return quantita;
    }

    public void setQuantita(double quantita) {
        this.quantita = quantita;
    }

    @Override
    public String toString() {
        return "Bevanda{" +
                "nome='" + nome + '\'' +
                ", quantita=" + quantita +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
