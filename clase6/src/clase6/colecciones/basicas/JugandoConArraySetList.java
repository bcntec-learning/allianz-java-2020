package clase6.colecciones.basicas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.swing.border.Border;

public class JugandoConArraySetList {

	public static void main(String... args) {

		Item[] items1 = new Item[0];
		Item items2[] = new Item[] { new Item(1), new Item(2) };
		Item[] items3 = new Item[2];
		Item[] items4 = new Item[] { items2[1], items2[0], new Item(-1) };

		System.out.println("items 1 tamaño:" + items1.length);
		System.out.println(items1);
		// System.out.println(items1[0]); // >= length o <0
		// -->ArrayIndexOutOfBoundsException

		System.out.println("items 2 tamaño:" + items2.length);
		System.out.println(items2);
		System.out.println(items2[0]);
		System.out.println(items2[items2.length - 1]);

		for (int i : new int[] { 1, 2, 3, 4, 5 }) { // java 1.5+
			System.out.println(i);
		}

		for (int i = 0; i < items2.length; i++) { // 1.4
			System.out.println(items2[i]);
		}

		for (Item i : items2) { // no es null safe.. si items2 es nulo, Null Pointer Exception
			System.out.println(i);
		}

		System.out.println("copiando...");
		// items2.length = 7;
		items2 = new Item[7]; // items2 ya es un objeto nuevo
		System.arraycopy(items4, 0, items2, 0, items4.length);
		for (Item i : items2) {
			System.out.println(i);
		}

		System.out.println("usando arraylist...");
		List<Item> items = new ArrayList();
		items.add(items4[0]);
		items.add(0, items4[1]);
		items.add(items4[0]);
		items.add(items4[0]);
		System.out.println("tamaño " + items.size());
		for (Item i : items) { // itera collection que cumple con iterable
			System.out.println(i);
		}

		System.out.println("accediendo de manera random...");
		System.out.println(items.get(0));

		System.out.println("usando hashset...");
		Set<Item> noDuplicado = new HashSet<>();
		noDuplicado.add(items4[0]);
		noDuplicado.add(items4[1]);
		noDuplicado.add(items4[0]);
		noDuplicado.add(items4[2]);
		noDuplicado.add(new Item(-2));
		noDuplicado.add(new Item(-2));
		items.add(items4[0]);
		System.out.println("tamaño " + noDuplicado.size());
		for (Item i : noDuplicado) { // itera collection que cumple con iterable
			System.out.println(i);
		}

		System.out.println("sin tipar la colecciones...");
		Set sinTipo = new HashSet<Item>(items);
		for (Object i : sinTipo) {
			System.out.println(((Item) i).getPos());
		}

		System.out.println(((Item) sinTipo.iterator().next()).getPos());

		System.out.println("usando TreeSet...");
		SortedSet<Item> ordenado = new TreeSet<Item>(items);
		ordenado.add(new Item(-1));
		System.out.println("tamaño " + ordenado.size());
		for (Item i : ordenado) {
			System.out.println(i.getPos());
		}

		Comparator<Item> inverso = new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				return o2.getPos() - o1.getPos();
			}

		};
		System.out.println("usando TreeSet con otro comparado...");
		SortedSet<Item> ordenadoConComparador = new TreeSet<Item>(inverso);
		ordenadoConComparador.addAll(ordenado);
		for (Item i : ordenadoConComparador) {
			System.out.println(i.getPos());
		}

		
		if(noDuplicado.contains(items4[0])) {
			System.out.println("si exsite");
		}
		
	}

}

class Item implements Comparable<Item> {

	private int pos;

	Item(int pos) {
		this.pos = pos;
	}

	public int getPos() {
		return pos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pos;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (pos != other.pos)
			return false;
		return true;
	}

	@Override
	public int compareTo(Item obj) {
		if (this == obj)
			return 0;
		return getPos() - obj.getPos();
	}

}
