package at.home.training.designpatterns.creational.abstractfactory;

import at.home.training.designpatterns.creational.abstractfactory.Geometry.Type;
import at.home.training.designpatterns.creational.factory.Shape.Shapes;

/**
 * In Factory pattern, we create object without exposing the creation logic to
 * the client and refer to newly created object using a common interface.
 * 
 * @author ludovic
 *
 */
public class ShapeFactory extends AbstractFactory {

	/* (non-Javadoc)
	 * @see at.home.training.designpatterns.creational.abstractfactory.AbstractFactory3#getShape(java.lang.String)
	 */
	public Shape getShape(final String shapeName) throws Exception {
		String providedShapeName = shapeName == null ? "" : shapeName.trim()
				.toUpperCase();
		return getShape(Shapes.valueOf(providedShapeName));
	}

	/* (non-Javadoc)
	 * @see at.home.training.designpatterns.creational.abstractfactory.AbstractFactory3#getShape(at.home.training.designpatterns.creational.factory.Shape.Shapes)
	 */
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

	@Override
	public Geometry getGeometry(String geoName) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Geometry getGeometry(Type typeOfGeo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
