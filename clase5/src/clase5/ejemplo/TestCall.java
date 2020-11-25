package clase5.ejemplo;

class Caller {
	private void init() {
		System.out.println("Initialized");
	}

	public void start() {
		init();
		System.out.println("Started");
	}
}

public class TestCall {
	public static void main(String[] args) {
		Caller c = new Caller();
		c.start();
		c.init();
	}
}
