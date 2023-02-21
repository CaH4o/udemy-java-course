package study;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MultipleCallableTask implements Callable<String> {

	private String name;

	public MultipleCallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		System.out.println("start");
		Thread.sleep(1000);
		return "Hello " + this.name;
	}
}

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		List<MultipleCallableTask> tasks = List.of(new MultipleCallableTask("Ole"), new MultipleCallableTask("Hele"),
				new MultipleCallableTask("Sev"));

		List<Future<String>> names = executorService.invokeAll(tasks);

		for (Future<String> name : names) {
			System.out.println(name.get());
		}

		System.out.println("main - done");
		executorService.shutdown();
	}

}
