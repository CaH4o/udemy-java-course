package study.accessClass;

public class MethodeAccessModifire {
	public void publucMethode() {
	};

	private void privateMethode() {
	};

	void defaultMethode() {
	};

	protected void protectedMethode() {
	};

	public static void main(String[] args) {
		MethodeAccessModifire cl = new MethodeAccessModifire();
		cl.defaultMethode();
		cl.publucMethode();
		cl.privateMethode();
		cl.protectedMethode();
	}
}
