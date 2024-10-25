package implementations;

import java.util.ArrayList;

import utilities.DictionaryADT;

public class Dictionary<K, V> implements DictionaryADT<K, V> {
	// constant
	private static final int DEFAULT_SIZE = 10;

	// index indicates pairing, e.g. keys[1] is stored at values[1]
	private ArrayList<K> keys;
	private ArrayList<V> values;

	@Override
	public V insert(K key, V value) {
		if (this.containsKey(key)) {
			return this.update(key, value);
		} else {
			keys.add(key);
			values.add(value);
			return null;
		}

	}

	@Override
	public V remove(K key) {
		for (K currentKey : keys) {
			if (currentKey.equals(key)) {
				K keyToReturn = currentKey;
				currentKey = null;
				return keyToReturn;
			}
		}
		// Jovie
		return null;
	}

	@Override
	public V update(K key, V value) {
		if (this.containsKey(key)) {

			V oldValue = this.lookup(key);

			int counter = 0;
			for (K currentKey : keys) {
				if (currentKey.equals(key)) {
					values.set(counter, value);
					return oldValue;
				}
				counter++;
			}

		}
		return null;

	}

	@Override
	public V lookup(K key) {
		// Jovie
		return null;
	}

	@Override
	public boolean containsKey(K key) {
		for (K currentKey : keys) {
			if (currentKey.equals(key)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean containsValue(V value) {
		// Jovie
		// TODO Auto-generated method stub
		return false;
	}

}
