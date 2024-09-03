package gianlucamessina.BE_U2_S1_L2;

import gianlucamessina.BE_U2_S1_L2.entities.Menu;
import gianlucamessina.BE_U2_S1_L2.entities.Ordine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeU2S1L2Application {

	public static void main(String[] args) {
		SpringApplication.run(BeU2S1L2Application.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeU2S1L2Application.class);

		/*Menu menu=context.getBean(Menu.class);
		Ordine ordine1= (Ordine) context.getBean("ordine1");
		Ordine ordine2= (Ordine) context.getBean("ordine2");
		menu.printMenu();
		System.out.println();
		System.out.println(ordine1);
		System.out.println(ordine2);*/
		context.close();
	}

}
