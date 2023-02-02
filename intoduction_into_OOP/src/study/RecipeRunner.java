package study;

public class RecipeRunner {

	public static void main(String[] args) {
		RecipeFishStone fish = new RecipeFishStone();
		RecipeSalad salad = new RecipeSalad();

		fish.execute();
		salad.execute();
	}

}
