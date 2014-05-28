package at.home.training.designpatterns.creational.builder;

public class MealBuilder {

	public Meal prepareVegMeal(){
		Meal meal= new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new PepsiCola());
		return meal;
	}
	
	public Meal prepareChickenMeal(){
		Meal meal= new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new CocaCola());
		return meal;
	}
	
}
