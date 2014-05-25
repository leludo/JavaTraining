package at.home.training.designpatterns.creational.factory;

public interface Shape {
	public enum Shapes {
		RECTANGLE, CIRCLE, SQUARE
	};

	void draw();
}
