package br.com.main;

public class SPStyleCheesePizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	
	public SPStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	void cut() {
		System.out.println("Cutting the pizza into a square slices");
	}

	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCreese();
		pepperoni = ingredientFactory.createPepperoni();
	}
}
