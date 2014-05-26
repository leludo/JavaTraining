package at.home.training.designpatterns.creational.abstractfactory;

import at.home.training.designpatterns.creational.abstractfactory.Geometry.Type;
import at.home.training.designpatterns.creational.factory.Shape.Shapes;

public abstract class AbstractFactory {
	public abstract Geometry getGeometry(String geoName) throws Exception;

	public abstract Geometry getGeometry(Type typeOfGeo) throws Exception;

	public abstract Shape getShape(String shapeName) throws Exception;

	public abstract Shape getShape(Shapes typeOfShape) throws Exception;

}
