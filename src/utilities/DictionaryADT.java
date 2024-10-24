package utilities;

/**
 * DictionaryADT.java
 *
 * @author your name
 * @version major.minor revision number starting at 1.0
 * 
 *          Class Definition: This interface represents the public contract for
 *          the implementation of Dictionary for the DictionaryADT Lab.
 */

public interface DictionaryADT<K, V> {
	/**
	 * Adds the provided key value pair to the Dictionary If the Dictionary already
	 * contains a pair with the given key, the given value will replace the current
	 * value of the given key.
	 * 
	 * Precondition, The dictionary exists. Postcondition, The dictionary holds new
	 * key value pair, determined by the parameters, if the key already existed the
	 * old value associated is returned
	 * 
	 * @param key,   a key which the specified value is associated with
	 * @param value, a value that is set to be associated with the given key
	 * 
	 * @return If the given key was already associated with a value in the
	 *         dictionary, insert returns the previous value of the given key. If
	 *         the given key is not already associated with a value in the
	 *         dictionary, insert will return null
	 * 
	 * @throws UnsupportedOperationException, if the insert operation is not
	 *                                        supported by this Dictionary
	 * @throws ClassCastException,            if the class of the given key or
	 *                                        value, does not match the required
	 *                                        classes of the Dictionary
	 * @throws NullPointerException,          if the given key or value is null
	 * 
	 */
	V insert(K key, V value);

	/**
	 * Removes the key value pair, for the given key. If the key exists in the
	 * Dictionary, remove returns its associated value. If the key does not exists
	 * in the Dictionary, remove returns null
	 * 
	 * Precondition, The dictionary exists and the given key exists in the
	 * dictionary. Postcondition, The dictionary no longer holds a key value pair
	 * for the provided key and the removed value is returned
	 * 
	 * @param key, a key of the key value pair to be removed
	 * 
	 * @return If the given key was exist in the dictionary, remove returns the
	 *         value associated with it. If the key does not exit in the dictionary,
	 *         remove returns a null value
	 * 
	 * @throws UnsupportedOperationException, if the remove operation is not
	 *                                        supported by this Dictionary
	 * @throws ClassCastException,            if the class of the given key does not
	 *                                        match the required class of key in the
	 *                                        Dictionary
	 * @throws NullPointerException,          if the given key is null
	 * 
	 */
	V remove(K key);

	/**
	 * Updates the value of the provided key with the provided value, If the
	 * dictionary does not contain the provided key, update returns null.
	 * 
	 * Precondition, The dictionary exists and the given key exists in the
	 * dictionary. Postcondition, The dictionary key now hold the provided value and
	 * the the old value is returned
	 * 
	 * @param key,   a key which is paired with a value to be updated
	 * @param value, a value to update the keys value pair with
	 * 
	 * @return If the given key exists in the Dictionary, the given value replaces
	 *         the previous one and returns the previous value. If the given key is
	 *         not in the Dictionary, a null value is returned
	 * 
	 * 
	 * @throws UnsupportedOperationException, if the update operation is not
	 *                                        supported by this Dictionary
	 * @throws ClassCastException,            if the class of the given key or
	 *                                        value, does not match the required
	 *                                        classes of the Dictionary
	 * @throws NullPointerException,          if the given key or value is null
	 * 
	 */
	V update(K key, V value);

	/**
	 * Returns the value associated with the given key
	 * 
	 * Precondition, The dictionary exists and the given key exists in the
	 * dictionary. Postcondition, lookup returns the value associated with the given
	 * key
	 * 
	 * @param key, a key of the value to be looked up
	 * 
	 * @return If the given key exists in the dictionary, return the value
	 *         associated with it. If the key does not exists in the dictionary,
	 *         lookup returns a null value
	 * 
	 * @throws UnsupportedOperationException, if the lookup operation is not
	 *                                        supported by this Dictionary
	 * @throws ClassCastException,            if the class of the given key does not
	 *                                        match the required class of key in the
	 *                                        Dictionary
	 * @throws NullPointerException,          if the given key is null
	 * 
	 */
	V lookup(K key);

	/**
	 * Returns true if the dictionary contains a value for the specified key.
	 *
	 * Pre-condition: a Dictionary object exists in memory.
	 *
	 * Post-condition: a boolean will be returned.
	 *
	 * @param key, the key to search for in the dictionary.
	 * @return boolean, returns true if there is a key/value pair that exists for
	 *         the key specified in the param.
	 * 
	 * @throws UnsupportedOperationException, if the containsKey operation is not
	 *                                        supported by this Dictionary
	 * @throws ClassCastException,            if the class of the given key does not
	 *                                        match the required class of key in the
	 *                                        Dictionary
	 * @throws NullPointerException           if the key passed as an argument is
	 *                                        null.
	 */
	boolean containsKey(K key);

	/**
	 * Returns true if the value specified to be searched for exists in the
	 * dictionary.
	 *
	 * Pre-condition: a Dictionary object exists in memory.
	 *
	 * Post-condition: a boolean will be returned.
	 *
	 * @param value, the value to search for in the dictionary.
	 * @return boolean, returns true if there is a value in the dictionary that
	 *         matches the specified argument.
	 * 
	 * @throws UnsupportedOperationException, if the containsValue operation is not
	 *                                        supported by this Dictionary
	 * @throws ClassCastException,            if the class of the given key does not
	 *                                        match the required class of key in the
	 *                                        Dictionary
	 * @throws NullPointerException           if the key passed as an argument is
	 *                                        null.
	 */
	boolean containsValue(V value);

}
