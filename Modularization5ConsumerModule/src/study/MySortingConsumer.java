package study;

import java.util.List;
import java.util.logging.Logger;

import study.util.MySorting;

public class MySortingConsumer {

	private static Logger logger = Logger.getLogger(MySortingConsumer.class.getName());

	public static void main(String[] args) {
		MySorting util = new MySorting();
		List<String> sorted = util.sort(List.of("Glory", "Ole", "Guph", "Morkva", "Li"));

		logger.info(sorted.toString());
	}

}
