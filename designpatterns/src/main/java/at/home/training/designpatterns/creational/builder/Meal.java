package at.home.training.designpatterns.creational.builder;

import java.util.ArrayList;

public class Meal {
	ArrayList<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0.0f;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}

	public void showItems(){
		for (Item item : items) {
			StringBuffer sb = new StringBuffer("Item : ");
			sb.append(item.getName())
			.append(", Price : ")
			.append(item.price())
			.append(", Packing:")
			.append(item.packing().pack());
			System.out.println(sb.toString());
		}
	}
}
