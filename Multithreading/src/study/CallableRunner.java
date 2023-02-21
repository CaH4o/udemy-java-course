package study;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		System.out.println("start");
		Thread.sleep(1000);
		return "Hello " + this.name;
	}
}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);

		System.out.println("kick off");
		Future<String> names = executorService.submit(new CallableTask("Ole"));

		String name = names.get();
		System.out.println(name);

		System.out.println("main - done");
		executorService.shutdown();
	}
}
