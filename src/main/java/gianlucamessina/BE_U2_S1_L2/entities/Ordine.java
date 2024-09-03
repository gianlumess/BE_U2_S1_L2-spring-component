package gianlucamessina.BE_U2_S1_L2.entities;

import gianlucamessina.BE_U2_S1_L2.enums.StatoOrdine;
import lombok.Getter;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
@Getter
public class Ordine {
    private int numeroOrdine;
    private List<Pizza> pizzeOrdinate;
    private List<Bevanda> bevandeOrdinate;
    private List<Topping> variazioni;
    private StatoOrdine statoOrdine;
    private int numeroCoperti;
    private String oraDiAcquisizione;
    private double costoCoperto;
    private double costoTotale;

    public Ordine(int numeroOrdine, List<Pizza> pizzeOrdinate, List<Bevanda> bevandeOrdinate, List<Topping> variazioni , int numeroCoperti) {
        this.numeroOrdine = numeroOrdine;
        this.statoOrdine=StatoOrdine.IN_CORSO;
        this.pizzeOrdinate = pizzeOrdinate;
        this.bevandeOrdinate = bevandeOrdinate;
        this.variazioni = variazioni;
        this.numeroCoperti = numeroCoperti;
        this.oraDiAcquisizione=LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
        this.costoTotale=setCostoTotale(pizzeOrdinate,bevandeOrdinate,variazioni);
    }

    public double setCostoTotale(List<Pizza>pizzaList,List<Bevanda> bevandaList,List<Topping> toppingList){
        double tot=2.50*numeroCoperti;

        for (Pizza pizza : pizzaList) {
            tot += pizza.getPrezzo();
        }
        for (Bevanda bevanda : bevandaList) {
            tot += bevanda.getPrezzo();
        }
        for (Topping topping : toppingList) {
            tot += topping.getPrezzo();
        }
        return tot;
    }
    
}
