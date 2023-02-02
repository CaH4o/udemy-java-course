package study;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	private BigDecimal principal;
	private BigDecimal interest;

	public SimpleInterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest);
	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		BigDecimal noOfYearsBigDecemal = new BigDecimal(noOfYears);
		BigDecimal totalValue = this.principal
				.add(this.interest.multiply(this.principal).multiply(noOfYearsBigDecemal));
		return totalValue;
	}

}
