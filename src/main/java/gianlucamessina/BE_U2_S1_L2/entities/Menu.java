package gianlucamessina.BE_U2_S1_L2.entities;



import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Menu {
    private List<Pizza> pizze;
    private List<Topping> toppings;
    private List<Bevanda> bevande;

    public Menu(List<Pizza> pizze, List<Topping> toppings, List<Bevanda> bevande) {
        this.pizze = pizze;
        this.toppings = toppings;
        this.bevande = bevande;
    }

    public void printMenu() {
        System.out.println("******* Menu *******");
        System.out.println("PIZZE");
        this.pizze.forEach(System.out::println);
        System.out.println();

        System.out.println("TOPPING");
        this.toppings.forEach(System.out::println);
        System.out.println();

        System.out.println("BEVANDE");
        this.bevande.forEach(System.out::println);
        System.out.println();

    }

    public List<Pizza> getPizze() {
        return pizze;
    }

    public void setPizze(List<Pizza> pizze) {
        this.pizze = pizze;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public List<Bevanda> getBevande() {
        return bevande;
    }

    public void setBevande(List<Bevanda> bevande) {
        this.bevande = bevande;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizze=" + pizze +
                ", toppings=" + toppings +
                ", bevande=" + bevande +
                '}';
    }
}
