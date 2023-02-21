package study;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		List<MultipleCallableTask> tasks = List.of(new MultipleCallableTask("Ole"), new MultipleCallableTask("Hele"),
				new MultipleCallableTask("Sev"));

		String name = executorService.invokeAny(tasks);

		System.out.println(name);

		System.out.println("main - done");
		executorService.shutdown();
	}

}
