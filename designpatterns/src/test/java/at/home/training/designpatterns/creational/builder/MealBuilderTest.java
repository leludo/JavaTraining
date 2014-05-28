package at.home.training.designpatterns.creational.builder;

import org.junit.Test;

public class MealBuilderTest {

	@Test
	public final void testPrepareVegMeal() {
		MealBuilder mb= new MealBuilder();
		System.out.println("VegMeql ");
		Meal vegMeal = mb.prepareVegMeal();
		System.out.println("Cost : "+vegMeal.getCost());
		vegMeal.showItems();
		
	}
//
//	@Test
//	public final void testPrepareChickenMeal() {
//		MealBuilder mb= new MealBuilder();
//		System.out.println("Chicken Meal ");
//		Meal chickenMeal = mb.prepareChickenMeal();
//		System.out.println("Cost : "+chickenMeal.getCost());
//		chickenMeal.showItems();
//	}

}
