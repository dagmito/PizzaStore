package br.com.main;

public class CearaPizzaIngredientFactory implements PizzaIngredientFactory{

	public Dough createDough() {
		return new AverageDough();
	}

	public Sauce createSauce() {
		return new PomarollaSauce();
	}

	public DryMeat createDryMeat() {
		return new SaltedDryMeat();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroon(), new RedPepper() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new PepperoniMex();
	}

	public Clam createClam() {
		return new ClamJuice();
	}

	public Cheese createCreese() {
		return new CheeseRennet();
	}
}