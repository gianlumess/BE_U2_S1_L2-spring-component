package gianlucamessina.BE_U2_S1_L2;


import gianlucamessina.BE_U2_S1_L2.entities.*;
import gianlucamessina.BE_U2_S1_L2.enums.StatoTavolo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
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

    @Bean(name = "tavolo1")
    public Tavolo tavolo1(){
        return new Tavolo(1,4);
    }

    @Bean
    public Tavolo tavolo2(){
        return new Tavolo(2,6);
    }

    @Bean
    public Tavolo tavolo3(){
        return new Tavolo(3,2);
    }

    @Bean(name = "ordine1")
    public Ordine ordine1(@Value("${order.coverCharge}")double costoCoperto){
        List<Pizza> pizzaList = new ArrayList<>();
        List<Bevanda> bevandaList = new ArrayList<>();
        List<Topping> toppingsList = new ArrayList<>();

        pizzaList.add(margherita());
        pizzaList.add(diavola());

        bevandaList.add(acquaNaturaleBevanda());
        bevandaList.add(cocaColaBevanda());

        toppingsList.add(burrataTopping());
        tavolo1().setStatoTavolo(StatoTavolo.OCCUPATO);
        return new Ordine(tavolo1(),1,costoCoperto,pizzaList,bevandaList,toppingsList,2);
    }

    @Bean(name = "ordine2")
    public Ordine ordine2(@Value("${order.coverCharge}")double costoCoperto){
        List<Pizza> pizzaList = new ArrayList<>();
        List<Bevanda> bevandaList = new ArrayList<>();
        List<Topping> toppingsList = new ArrayList<>();

        pizzaList.add(margherita());
        pizzaList.add(diavola());
        pizzaList.add(diavola());
        pizzaList.add(sanDaniele());

        bevandaList.add(acquaNaturaleBevanda());
        bevandaList.add(acquaFrizzanteBevanda());
        bevandaList.add(cocaColaBevanda());
        bevandaList.add(cocaColaBevanda());

        toppingsList.add(burrataTopping());
        toppingsList.add(cipollaTopping());
        toppingsList.add(crudoTopping());
        tavolo1().setStatoTavolo(StatoTavolo.OCCUPATO);
        return new Ordine(tavolo2(),2,costoCoperto,pizzaList,bevandaList,toppingsList,4);
    }

}
