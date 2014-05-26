package at.home.training.designpatterns.creational.abstractfactory;

public interface Shape {
	public enum Shapes {
		RECTANGLE, CIRCLE, SQUARE
	};

	void draw();
}
