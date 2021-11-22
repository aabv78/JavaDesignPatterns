package Creational.D04_Builder;

public class Burger {
	private Integer size;
	private Boolean cheese;
	private Boolean pepperoni;
	private Boolean lettuce;
	private Boolean tomato;

	public static class Builder {
		private Integer size ;
		private Boolean cheese = false;
		private Boolean pepperoni = false;
		private Boolean lettuce = false;
		private Boolean tomato = false;

		public Builder(Integer size) {
			this.size = size;
		}

		public Builder addPepperoni()
		{
			this.pepperoni = true;
			return this;
		}

		public Builder addLettuce()
		{
			this.lettuce = true;
			return this;
		}

		public Builder addCheese()
		{
			this.cheese = true;
			return this;
		}

		public Builder addTomato()
		{
			this.tomato = true;
			return this;
		}

		public Burger build(){
			Burger burger = new Burger();
			burger.size = this.size;
			burger.cheese = this.cheese;
			burger.lettuce = this.lettuce;
			burger.pepperoni = this.pepperoni;
			burger.tomato = this.tomato;
			return burger;
		}

	}

	private Burger() {
	}

	@Override
	public String toString() {
		return "Burger{" +
				"size=" + size +
				", cheese=" + cheese +
				", pepperoni=" + pepperoni +
				", lettuce=" + lettuce +
				", tomato=" + tomato +
				'}';
	}
}
