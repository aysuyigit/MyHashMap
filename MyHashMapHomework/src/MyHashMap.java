public class MyHashMap {

	Object[] keys;
	Object[] values;
	

	public MyHashMap() {
		keys = new String[0];
		values = new String[0];
	}

	public void put(Object key, Object value) {
		
		int keyLenght = this.keys.length;
		Object[] tmpKeys = new Object[keyLenght + 1];
		Object[] tmpValues = new Object[keyLenght + 1];
		
		for (int i = 0; i < keyLenght; i++) {
			tmpKeys[i] = this.keys[i];
			tmpValues[i] = this.values[i];
		}

		tmpKeys[keyLenght] = key;
		tmpValues[keyLenght] = value;

		this.keys = tmpKeys;
		this.values = tmpValues;
    }

	public void remove(Object key) {
		int keyLenght = this.keys.length;
		Object[] tmpKeys = new Object[keyLenght - 1];
		Object[] tmpValues = new Object[keyLenght - 1];
		int j = 0;
		for (int i = 0; i < keyLenght - 1; i++) {
			if (this.keys[i] != key) {
				tmpKeys[i] = this.keys[j];
				tmpValues[i] = this.values[j];
				j++;
			}
			if (this.keys[i] == key) {
				j = i + 1;
				tmpKeys[i] = this.keys[j];
				tmpValues[i] = this.values[j];
				j++;
			}
		}
		this.keys = tmpKeys;
		this.values = tmpValues;
	}

	public void clear() {
		this.keys = new Object[0];
		this.values = new Object[0];
	}
	
	
	public Object[] get() {
		
		Object[] array = new Object[this.keys.length];
		for (int i = 0; i < this.keys.length; i++) {

			array[i] = this.keys[i] + "=" + this.values[i];
		}

		return array;
	}
	
	
}