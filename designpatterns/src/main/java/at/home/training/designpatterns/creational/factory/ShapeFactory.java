package at.home.training.designpatterns.creational.factory;

import at.home.training.designpatterns.creational.factory.Shape.Shapes;

/**
 * In Factory pattern, we create object without exposing the creation logic to
 * the client and refer to newly created object using a common interface.
 * 
 * @author ludovic
 *
 */
public class ShapeFactory {

	public Shape getShape(final String shapeName) throws Exception {
		String providedShapeName = shapeName == null ? "" : shapeName.trim()
				.toUpperCase();
		return getShape(Shapes.valueOf(providedShapeName));
	}

	public Shape getShape(final Shapes typeOfShape) throws Exception {
		final Shape produced;
		switch (typeOfShape) {
		case RECTANGLE:
			produced = new Rectangle();
			break;
		default:
			throw new Exception(typeOfShape != null ? "Not a registred shape :"
					+ typeOfShape.name() : "Shape type must be provided");
		}
		return produced;
	}
}
