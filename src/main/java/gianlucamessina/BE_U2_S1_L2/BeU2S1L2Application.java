package gianlucamessina.BE_U2_S1_L2;

import gianlucamessina.BE_U2_S1_L2.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeU2S1L2Application {

	public static void main(String[] args) {
		SpringApplication.run(BeU2S1L2Application.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeU2S1L2Application.class);

		Menu menu=context.getBean(Menu.class);

		menu.printMenu();
		context.close();
	}

}
