package at.home.training.designpatterns.creational.factory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import at.home.training.designpatterns.creational.factory.Shape.Shapes;

public class ShapeFactoryTest {

	private ShapeFactory shapeFactory;

	@Before
	public void initialize() {
		shapeFactory = new ShapeFactory();
	}

	@Test
	public final void testGetShapeString() {
		try {
			shapeFactory.getShape("Rectangle");
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public final void testGetShapeShapes() {
		try {
			shapeFactory.getShape(Shapes.RECTANGLE);
		} catch (Exception e) {
			fail(e.getMessage());
		}
		try {
			if (shapeFactory.getShape((Shapes) null) != null)
				fail("The factory musn't allow creation from wrong parameters");
		} catch (Exception e) {
		}
	}

}
