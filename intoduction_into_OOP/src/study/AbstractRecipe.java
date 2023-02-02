package study;

public abstract class AbstractRecipe {

	public void execute() {
		prepareFoodAndTools();
		cookingAndSerivec();
		cleanUp();
	}

	protected abstract void prepareFoodAndTools();

	protected abstract void cookingAndSerivec();

	protected abstract void cleanUp();

}
