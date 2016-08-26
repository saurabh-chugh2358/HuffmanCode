package org.gontuseries.springcore;

public class Restaurant {
	
	private String welcomeNote;
	IHotDrink drink;
	
	
	
	public Restaurant(IHotDrink drink) {
		this.drink = drink;
	}

	/*public String getWelcomeNote() {
		return welcomeNote;
	}

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void greetCustomer(){
		System.out.println(welcomeNote);
	}
*/	
	public void prepareHotDrink(){
		drink.prepareHotDrink();
	}

}

