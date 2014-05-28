package at.home.training.designpatterns.creational.abstractfactory;

import at.home.training.designpatterns.creational.factory.Shape.Shapes;
import static org.junit.Assert.fail;
import org.junit.Test;

public class FactoryProducerTest {

	@Test
	public final void testGetFactory() {
		try {
			FactoryProducer.getFactory("SHAPE").getShape(Shapes.RECTANGLE).draw();
		} catch (Exception e) {
			fail(e.getMessage() + " oups");
		}
	}

}
