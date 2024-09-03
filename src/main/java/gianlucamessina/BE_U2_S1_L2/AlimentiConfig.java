package gianlucamessina.BE_U2_S1_L2;


import gianlucamessina.BE_U2_S1_L2.entities.Bevanda;
import gianlucamessina.BE_U2_S1_L2.entities.Menu;
import gianlucamessina.BE_U2_S1_L2.entities.Pizza;
import gianlucamessina.BE_U2_S1_L2.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AlimentiConfig {
    @Bean
    public Topping pomodoroTopping(){
        return new Topping("Pomodoro",0,0);
    }
    @Bean
    public Topping mozzarellaTopping(){
        return new Topping("Mozzarella",90,0.80);
    }

    @Bean
    public Topping crudoTopping(){
        return new Topping("Prosciutto Crudo",150,2.00);
    }
    @Bean
    public Topping burrataTopping(){
        return new Topping("Burrata",400,2.00);
    }
    @Bean
    public Topping cipollaTopping(){
        return new Topping("Cipolla",20,0.50);
    }
    @Bean(name = "salame_piccante")
    @Primary
    public Topping salamePiccanteTopping(){
        return new Topping("Salame piccante",80,1);
    }
    @Bean
    public Bevanda acquaNaturaleBevanda(){
        return new Bevanda("Acqua Naturale",0,2.00,1);
    }
    @Bean
    public Bevanda acquaFrizzanteBevanda(){
        return new Bevanda("Acqua Frizzante",0,2.50,1);
    }
    @Bean
    public Bevanda cocaColaBevanda(){
        return new Bevanda("Coca-Cola",139,2.50,0.30);
    }

    @Bean
    public Pizza margherita(){
        List<Topping>toppingList=new ArrayList<>();
        toppingList.add(pomodoroTopping());
        toppingList.add(mozzarellaTopping());
        return new Pizza("Margherita",toppingList);
    }

    @Bean
    public Pizza diavola(){
        List<Topping>toppingList=new ArrayList<>();
        toppingList.add(pomodoroTopping());
        toppingList.add(mozzarellaTopping());
        toppingList.add(salamePiccanteTopping());
        return new Pizza("Diavola",toppingList);
    }

    @Bean
    public Pizza sanDaniele(){
        List<Topping>toppingList=new ArrayList<>();
        toppingList.add(pomodoroTopping());
        toppingList.add(mozzarellaTopping());
        toppingList.add(crudoTopping());
        return new Pizza("San Daniele",toppingList);
    }

    @Bean
    public Menu menu(){
        List<Pizza> pizzaList = new ArrayList<>();
        List<Bevanda> bevandaList = new ArrayList<>();
        List<Topping> toppingsList = new ArrayList<>();

        pizzaList.add(margherita());
        pizzaList.add(diavola());
        pizzaList.add(sanDaniele());

        bevandaList.add(acquaNaturaleBevanda());
        bevandaList.add(acquaFrizzanteBevanda());
        bevandaList.add(cocaColaBevanda());

        toppingsList.add(cipollaTopping());
        toppingsList.add(crudoTopping());
        toppingsList.add(salamePiccanteTopping());
        toppingsList.add(burrataTopping());

        return new Menu(pizzaList,toppingsList,bevandaList);
    }


}
