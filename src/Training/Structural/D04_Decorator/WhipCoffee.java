package Training.Structural.D04_Decorator;

public class WhipCoffee implements Coffee {

	protected Coffee coffee;

	public WhipCoffee(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public Integer getCost() {
		return this.coffee.getCost() + 5;
	}

	@Override
	public String getDescription() {
		return this.coffee.getDescription().concat(", whip") ;
	}


}
