package com.practicalunittesting.chp11.code_coverage.first;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Account {
	private final int amount;
	private final String currency;

	public Account(int amount, String currency) {
		if (currency == null || currency.isEmpty()) {
			throw new IllegalArgumentException();
		}
		this.amount = amount;
		this.currency = currency;
	}

	public int getAmount() {
		return amount;
	}

	public String getCurrency() {
		return currency;
	}
}
