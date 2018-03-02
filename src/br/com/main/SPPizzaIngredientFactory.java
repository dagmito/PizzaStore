package br.com.main;

public class SPPizzaIngredientFactory implements PizzaIngredientFactory{

	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	public DryMeat createDryMeat() {
		return new DryMeatCheese();
	}

	public Veggies[] createVeggies() {
		Veggies freshVegetables[] = { new Garlic(), new Onion(), new Mushroon(), new RedPepper() };
		return freshVegetables;
	}

	public Pepperoni createPepperoni() {
		return new PepperoniSauce();
	}

	public Clam createClam() {
		return new ClamJuice();
	}

	public Cheese createCreese() {
		return new CheeseMussarela();
	}
}
