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
public class GeometricFactory extends AbstractFactory {

	/* (non-Javadoc)
	 * @see at.home.training.designpatterns.creational.abstractfactory.AbstractFactory2#getGeometry(java.lang.String)
	 */
	public Geometry getGeometry(final String geoName) throws Exception {
		String providedGeoName = geoName == null ? "" : geoName.trim()
				.toUpperCase();
		return getGeometry(Type.valueOf(providedGeoName));
	}

	/* (non-Javadoc)
	 * @see at.home.training.designpatterns.creational.abstractfactory.AbstractFactory2#getGeometry(at.home.training.designpatterns.creational.abstractfactory.Geometry.Type)
	 */
	public Geometry getGeometry(final Type typeOfGeo) throws Exception {
		final Geometry produced;
		switch (typeOfGeo) {
		case LINE:
			produced = new Line();
			break;
		default:
			throw new Exception(typeOfGeo != null ? "Not a registred geometry :"
					+ typeOfGeo.name() : "Geometry type must be provided");
		}
		return produced;
	}

	@Override
	public Shape getShape(String shapeName) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(Shapes typeOfShape) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
