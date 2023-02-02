package study;

public class WhileNumberPlayer {

	private int limit;

	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	public void printSquaresUptoLimit() {
		printLoop(2);
	}

	public void printCubsUptoLimit() {
		printLoop(3);

	}

	private void printLoop(int times) {
		int loop = 1;
		int loopTimes = getLoopTimes(loop, times);

		while (loopTimes <= limit) {
			System.out.println(loopTimes);
			++loop;
			loopTimes = getLoopTimes(loop, times);
		}
	}

	private int getLoopTimes(int loop, int times) {
		int res = loop;
		while (--times > 0)
			res = res * loop;
		return res;
	}

}
