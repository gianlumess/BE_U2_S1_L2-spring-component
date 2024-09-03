package gianlucamessina.BE_U2_S1_L2;

import gianlucamessina.BE_U2_S1_L2.entities.Menu;
import gianlucamessina.BE_U2_S1_L2.entities.Ordine;
import gianlucamessina.BE_U2_S1_L2.entities.Tavolo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private Menu menu;
    @Autowired
    @Qualifier("tavolo1")
    private Tavolo tavolo1;
    @Autowired
    @Qualifier("ordine1")
    private Ordine ordine;



    @Override
    public void run(String... args) throws Exception {
        menu.printMenu();
        System.out.println();
        System.out.println(ordine);

    }
}
