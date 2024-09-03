package gianlucamessina.BE_U2_S1_L2.entities;

import java.util.List;

public class Pizza extends Alimento {
    private List<Topping>toppingsList;


    public Pizza(String nome, List<Topping> toppings) {
        super(nome, 1104, 4.99);
        this.toppingsList = toppings;
        this.calorie=setCalories(toppings);
        this.prezzo=setPrice(toppings);
    }

    public double setPrice(List<Topping> toppings){
        double tot=4.99;
        if(toppings!=null){
            for (int i = 0; i < toppings.size(); i++) {
                tot+=toppings.get(i).getPrezzo();
            }
        }
        return tot;
    }

    public int setCalories(List<Topping> toppings){
        int totCal=1104;
        if(toppings!=null){
            for (int i = 0; i < toppings.size(); i++) {
                totCal+=toppings.get(i).getCalorie();
            }
        }
        return totCal;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nome='" + nome + '\'' +
                ", toppings=" + toppingsList +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
