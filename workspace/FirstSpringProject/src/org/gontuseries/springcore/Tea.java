package org.gontuseries.springcore;

public class Tea implements IHotDrink {

	@Override
	public void prepareHotDrink() {
		System.out.println("We're preparing tea for you");

	}

}
