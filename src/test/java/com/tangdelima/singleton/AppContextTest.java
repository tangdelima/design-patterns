package com.tangdelima.singleton;

import org.junit.Assert;
import org.junit.Test;

public class AppContextTest {

	final String APP_MESSAGE = "Message from Singleton";
	final String CHILD_MESSAGE = "Message from Child";
	
	@Test
	public void test1(){
		// gets two instances of the same singleton implementation.
		AppContext context1 = AppContext.getInstance();
		AppContext context2 = AppContext.getInstance();
		
		// Both variables should point to the same instance
		Assert.assertTrue(context1 == context2);
		// and should have the same value
		Assert.assertSame(APP_MESSAGE, context1.getMessage());
		Assert.assertSame(APP_MESSAGE, context2.getMessage());
	}
	
	@Test
	public void test2() {
		// gets two instances of two different implementations
		AppContext context1 = AppContext.getInstance();
		AppContext context2 = ChildContext.getInstance();
		
		// Both variables should still point to the same instance
		Assert.assertTrue(context1 == context2);
		// and should have the different value
		Assert.assertSame(APP_MESSAGE, context1.getMessage());
		Assert.assertSame(APP_MESSAGE, context2.getMessage());
	}
	
	@Test
	public void test3() {
		// Two executions should have get same instance from Singleton
		AppContext context1 = AppContext.getInstance();
		
		Thread thread1 = new Thread(new SingletonThread(context1));
		Thread thread2 = new Thread(new SingletonThread(context1));
		
		thread1.start();
		thread2.start();
	}
	
	class SingletonThread implements Runnable{

		private AppContext outerContext;
		
		public SingletonThread(AppContext outerContext) {
			this.outerContext = outerContext;
		}
		
		public void run() {
			Assert.assertTrue(this.outerContext == AppContext.getInstance());
		}
	}
}
