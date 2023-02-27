package study;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounter {
	private AtomicInteger value1 = new AtomicInteger();
	private AtomicInteger value2 = new AtomicInteger();

	public void incrementV1() {
		this.value1.incrementAndGet();
	}

	public int getValue1() {
		return this.value1.get();
	}

	public void incrementV2() {
		this.value2.incrementAndGet();
	}

	public int getValue2() {
		return this.value2.get();
	}
}

//2
/*
 * public class BiCounter { private int value1 = 0; private int value2 = 0;
 * 
 * Lock lockForValue1 = new ReentrantLock(); Lock lockForValue2 = new
 * ReentrantLock();
 * 
 * public void incrementV1() { lockForValue1.lock(); ++this.value1;
 * lockForValue1.unlock(); }
 * 
 * public int getValue1() { return this.value1; }
 * 
 * public void incrementV2() { lockForValue2.lock(); ++this.value2;
 * lockForValue2.unlock(); }
 * 
 * public int getValue2() { return this.value2; } }
 */

//1
/*
 * public class BiCounter { private int value1 = 0; private int value2 = 0;
 * 
 * synchronized public void incrementV1() { ++this.value1; }
 * 
 * public int getValue1() { return this.value1; }
 * 
 * synchronized public void incrementV2() { ++this.value2; }
 * 
 * public int getValue2() { return this.value2; } }
 */
