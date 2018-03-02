package br.com.main;

public class CearaStyleDryMeatPizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	
	public CearaStyleDryMeatPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		dryMeat = ingredientFactory.createDryMeat();
	}
}
