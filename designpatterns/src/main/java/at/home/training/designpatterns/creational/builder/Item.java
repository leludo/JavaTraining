package at.home.training.designpatterns.creational.builder;

public interface Item {
	public abstract String getName();

	public abstract Packing packing();

	public abstract float price();

}
