package study;

public class RecipeFishStone extends AbstractRecipe {

	@Override
	protected void prepareFoodAndTools() {
		System.out.println("Get all ingridients");
		System.out.println("switch on and worm a stone on 150C");

	}

	@Override
	protected void cookingAndSerivec() {
		System.out.println("Slise it and dressing");
		System.out.println("put dish and wait 50 minuts");
	}

	@Override
	protected void cleanUp() {
		System.out.println("switch off the stone");
		System.out.println("Clean tools and the stone");
	}

}
