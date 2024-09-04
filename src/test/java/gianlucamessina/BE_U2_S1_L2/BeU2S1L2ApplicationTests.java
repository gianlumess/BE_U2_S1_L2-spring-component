package gianlucamessina.BE_U2_S1_L2;

import gianlucamessina.BE_U2_S1_L2.entities.Topping;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Import(AlimentiConfig.class)
class BeU2S1L2ApplicationTests {
		@Autowired
		@Qualifier("burrataTopping")
		Topping burrata;
		@Autowired
		@Qualifier("crudoTopping")
		Topping crudo;


	@Test
	void testSetPriceWithToppings() {
		List<Topping> toppingList= new ArrayList<>();
		toppingList.add(burrata);
		toppingList.add(crudo);

		double totalPrice=4.99;

		for (int i = 0; i < toppingList.size(); i++) {
			totalPrice+=toppingList.get(i).getPrezzo();
		}

		assertEquals(4.99 + 2.00 + 2.00 ,totalPrice);
	}

	@Test
	void testSetPriceWithoutToppings(){
		List<Topping> toppingList= new ArrayList<>();
		double totalPrice=4.99;

		for (int i = 0; i < toppingList.size(); i++) {
			totalPrice+=toppingList.get(i).getPrezzo();
		}
		assertEquals(4.99,totalPrice);
	}

	@Test
	void testSetCaloriesWithToppings(){
		List<Topping> toppingList= new ArrayList<>();
		toppingList.add(burrata);
		toppingList.add(crudo);

		int totalCalories=1104;

		for (int i = 0; i < toppingList.size(); i++) {
			totalCalories+=toppingList.get(i).getCalorie();
		}
		assertEquals(1104+400+150,totalCalories);
	}

	@Test
	void testSetCaloriesWithoutToppings(){
		List<Topping> toppingList= new ArrayList<>();
		int totalCalories=1104;

		for (int i = 0; i <toppingList.size() ; i++) {
			totalCalories+=toppingList.get(i).getCalorie();
		}

		assertEquals(1104,totalCalories);
	}

}
