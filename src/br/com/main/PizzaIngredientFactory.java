package br.com.main;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public DryMeat createDryMeat();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clam createClam();
	public Cheese createCreese();
}
