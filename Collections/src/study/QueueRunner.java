package study;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparatorAsc implements Comparator<String> {
	@Override
	public int compare(String thisOne, String thatOne) {
		return Integer.compare(thisOne.length(), thatOne.length());
	}
}

class StringLengthComparatorDesc implements Comparator<String> {
	@Override
	public int compare(String thisOne, String thatOne) {
		return Integer.compare(thatOne.length(), thisOne.length());
	}
}

public class QueueRunner {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		queue.addAll(List.of("Zebra", "Monkey", "Cat"));
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll() + '\n');

		queue = new PriorityQueue<>(new StringLengthComparatorAsc());
		queue.addAll(List.of("Zebra", "Monkey", "Cat"));
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll() + '\n');

		queue = new PriorityQueue<>(new StringLengthComparatorDesc());
		queue.addAll(List.of("Zebra", "Monkey", "Cat"));
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}

}
