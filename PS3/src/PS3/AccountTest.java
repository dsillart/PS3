package PS3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AccountTest {

		Account c;
		
		@Before
		public void setUp() throws Exception {
			c = new Account(7,101,0.07);
		}

		@After
		public void tearDown() throws Exception {
			c = null;
		}

		@Test(expected=InsufficientFundsException.class)
		public final void withdrawTest() throws InsufficientFundsException {
			c.deposit(500.00);
			assertEquals("$400 Expected, actual is $500",(long)c.getBalance(),(long)500.00);
	        c.withdraw(900);
		}

		@Test
		public final void testDeposit() {
			int x = 0;
			
			while (x < 20) {
				c.deposit(1000000000);
			}
			
		}

		@Test
		public final void testGetBalance() {
			assertEquals((long)c.getBalance(),(long)101);
		}

		@Test
		public final void testGetID() {
			assertEquals((long)c.getID(),(long)7);
		}
	}
