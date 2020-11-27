package clase6.colecciones.basicas;

import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;

public class JugandoConMapas {

	
	public static void main(String... args) {
		Map<String, Item> map = new HashMap<>();
		
		map.put("abc", new Item(123));
		map.put("abc", new Item(124));
		map.putIfAbsent("abc", new Item(125));
		
		

		Item item = map.get("abc");

		if(map.containsKey("abc")) {
			System.out.println("abc ya existe");
		}
		
		Item itemPorDefecto =map.getOrDefault("bcd", new Item(0));

		if(!map.containsKey("bcd")) {  //utiliza .equals del objeto String
			System.out.println("bcd no existe");
		}
		
		if(map.containsValue(item)) { //utiliza .equals del objeto Item
			System.out.println("item ya existe");
		}
		
		
		for(Map.Entry<String, Item> i : map.entrySet()) {
			System.out.println(i.getKey()+" -> "+i.getValue().i + " ----- "+i.getClass());
		}

		for(String i : map.keySet()) {
			System.out.println(i+" -> "+map.get(i).i);
		}

		for(Item i : map.values()) {
			System.out.println(i.i);
		}
	
		map.put("zzz", new Item(0) {
			public void calcular() {
				
			}
			
		});

		for(Item i : map.values()) {
			System.out.println(i.i +"->"+i.getClass());
		}
		
		
	}
	
	
	static class Item {
		int i;
		Item(int i) {
			this.i=i;
		}
		
	}
}
