package study;

class Amount {
	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	/*
	 * public void addAmount(Amount that) { if (this.currency.equals(that.currency))
	 * { this.amount += that.amount; } else { throw new
	 * RuntimeException("Currencies Don't matched."); } }
	 */

	public void addAmount(Amount that) throws /* Exception */ CurrenciesDoNotMatchedException {
		if (this.currency.equals(that.currency)) {
			this.amount += that.amount;
		} else {
			// throw new Exception("Currencies Don't matched: " + this.currency + " and " +
			// that.currency);
			throw new CurrenciesDoNotMatchedException(
					"Currencies Don't matched: " + this.currency + " and " + that.currency);
		}
	}

	@Override
	public String toString() {
		return "Ammount [currency=" + currency + ", amount=" + amount + "]";
	}

}

class CurrenciesDoNotMatchedException extends Exception {
	public CurrenciesDoNotMatchedException(String msg) {
		super(msg);
	}
}

public class ThroingExeptionsRunner {

	public static void main(String[] args) throws CurrenciesDoNotMatchedException {
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("EUR", 20);

		amount1.addAmount(amount2);
		System.out.println(amount1);
	}

}
