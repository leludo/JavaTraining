package at.home.training.designpatterns.creational.abstractfactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("GEOMETRIC")) {
			return new GeometricFactory();
		}
		return null;
	}
}