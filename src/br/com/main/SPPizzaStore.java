package br.com.main;

public class SPPizzaStore extends PizzaStore{
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = 
				new SPPizzaIngredientFactory();
		
		if (item.equals("cheese")) {
			
			pizza = new SPStyleCheesePizza(ingredientFactory);
			pizza.setName("Pizza de Mussarela no Estilo Paulistano");
			
		}else {
			pizza = new StandardStylePizza(ingredientFactory);
			pizza.setName("Pizza Standard");
		}
		
		return pizza;
	}
}
