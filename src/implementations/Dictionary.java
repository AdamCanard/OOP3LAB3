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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V remove(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V update(K key, V value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V lookup(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsKey(K key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(V value) {
		// TODO Auto-generated method stub
		return false;
	}

}
