package br.com.main;

public class CearaPizzaStore extends PizzaStore{
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = 
				new CearaPizzaIngredientFactory();
		
		if (item.equals("drymeat")) {
			
			pizza = new CearaStyleDryMeatPizza(ingredientFactory);
			pizza.setName("Pizza de Carne Seca no Estilo Cearence");
			
		} else {
			pizza = new StandardStylePizza(ingredientFactory);
			pizza.setName("Pizza indefinida!");
		}
		
		return pizza;
	}
}
