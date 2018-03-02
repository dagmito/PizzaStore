package br.com.main;

public class StandardStylePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public StandardStylePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	void prepare() {
		System.out.println("Can't prepare this type of pizza " + name);
	}

}
