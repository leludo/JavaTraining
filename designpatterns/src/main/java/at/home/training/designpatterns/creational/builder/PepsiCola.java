package at.home.training.designpatterns.creational.builder;

public class PepsiCola extends ColdDrink {

	public String getName() {

		return "Pepsi cola";
	}

	@Override
	public float price() {

		return 1.8f;
	}

}
