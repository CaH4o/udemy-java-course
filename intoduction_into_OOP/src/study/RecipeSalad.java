package study;

public class RecipeSalad extends AbstractRecipe {

	@Override
	protected void prepareFoodAndTools() {
		System.out.println("unfriz all");

	}

	@Override
	protected void cookingAndSerivec() {
		System.out.println("slice it by cub");
		System.out.println("mixt with souse");
		System.out.println("put in refregirator in 10 minutes");

	}

	@Override
	protected void cleanUp() {
		System.out.println("Clean the tools");
	}

}
