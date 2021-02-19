package test;

import org.junit.Test;
import static org.junit.Assert.*;
import logic.CashierController;

public class TestCashierController {
	@Test
	public void testTransactionWithChangesNormalUse() {
		CashierController cc = new CashierController();
		assertEquals("Here is your change: 18.5", cc.transactionWithChange(30,48.5));
	}
	@Test
	public void testTransactionWithChangesNotEnough() {
		CashierController cc = new CashierController();
		assertEquals("Not enough money, you need 18.5", cc.transactionWithChange(48.5,30));
	}
	@Test
	public void testTransactionWithChangesNegativeAValue() {
		CashierController cc = new CashierController();
		assertEquals("Here is your change: 78.5", cc.transactionWithChange(-30,48.5));
	}
}
