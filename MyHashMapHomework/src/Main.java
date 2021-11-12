public class Main {

	public static void main(String[] args) {

		MyHashMap hashmap = new MyHashMap();
		hashmap.put(1, "Aysu");
		hashmap.put("İstanbul", 5.1);
		hashmap.put(25, 55);

		//hashmap.remove("İstanbul");
		//hashmap.clear();
		
		for (Object map : hashmap.get()) {
			System.out.println(map);
		}
		
		

	}
}
