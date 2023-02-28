package study;

class DefaultClass {

}

public class NestedClassesRunner {
	public int i = 0;

	class InnerClass {
		public void methodeI() {
			i += 5;
		}
	}

	static class StaticNestedClass {
		public void methodeI() {
			// i += 5; =error
		}
	}

	public static void main(String[] args) {
		// InnerClass innerClass = new InnerClass(); - error
		StaticNestedClass staticNestedClass = new StaticNestedClass();

		NestedClassesRunner nestedClassesRunner = new NestedClassesRunner();
		InnerClass innerClass = nestedClassesRunner.new InnerClass();
	}

}
