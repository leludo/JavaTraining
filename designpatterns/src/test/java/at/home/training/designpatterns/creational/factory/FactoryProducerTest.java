package at.home.training.designpatterns.creational.factory;

import static org.junit.Assert.*;

import org.junit.Test;

import at.home.training.designpatterns.creational.abstractfactory.FactoryProducer;
import at.home.training.designpatterns.creational.factory.Shape.Shapes;

public class FactoryProducerTest {

	@Test
	public final void testGetFactory() {
		try {
			FactoryProducer.getFactory("SHAPE").getShape(Shapes.RECTANGLE).draw();
		} catch (Exception e) {
			fail(e.getMessage() + " oups");
		};
	}

}
