package at.home.training.designpatterns.creational.builder;

public class VegBurger extends Burger {

	public String getName() {
		// TODO Auto-generated method stub
		return "Vegetarian burger";
	}

	@Override
	public float price() {
		
		return 4.0f;
	}

}
