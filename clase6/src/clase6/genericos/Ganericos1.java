package clase6.genericos;

public class Ganericos1<T extends Ganericos1.Item> {

	public void calc(T i) {
		i.calc();
	}

	static class Item {
		public void calc() {

		}
	}

	static class SubItem extends Ganericos1.Item {
		public void calc() {
			super.calc();
		}
	}
	
	
	public static void main(String... args) {
		Ganericos1<Item> items;
		Ganericos1<SubItem> subItems;

		//Ganericos1<Long> longs;
		
	}
	
	
}
