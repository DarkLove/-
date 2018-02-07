package com.fuxing.style;

public class Test04{
	public static void main(String[] args) {
//		NutritionFacts cocaCola = new NutritionFacts.Builder(1, 2)
//									.calories(3)
//									.fat(4)
//									.sodium(5)
//									.carbohydrate(6)
//									.fat(4)
//								    .bulid();	
//		cocaCola.print();
		
//		Math
		
		
	}
}


interface Builders<T> {
	T bulid();
}

class NutritionFacts{
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate; 
	
	private NutritionFacts(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}
	

	@Override
	public String toString() {
		return "NutritionFacts [servingSize=" + servingSize + ", servings=" + servings + ", calories=" + calories
				+ ", fat=" + fat + ", sodium=" + sodium + ", carbohydrate=" + carbohydrate + "]";
	}
	
	public void print() {
		System.out.println(toString());
	}
	

	public static class Builder implements Builders<NutritionFacts>{
		private int servingSize;
		private int servings;
		private int calories = 0;
		private int fat = 0;
		private int sodium = 0;
		private int carbohydrate = 0;
		
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize ;
			this.servings = servings ;
		}
		
		public Builder fat(int val) {
			fat = val ;
			return this ;
		}
		
		public Builder sodium(int val) {
			sodium = val ;
			return this ;
		}
		
		public Builder carbohydrate(int val) {
			carbohydrate = val ;
			return this ;
		}
		
		public Builder calories(int val) {
			calories = val ;
			return this ;
		}
		
		public NutritionFacts bulid() {
			return new NutritionFacts(this);
		}
  
	}
	 
}






