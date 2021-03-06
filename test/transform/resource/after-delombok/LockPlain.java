import java.util.Map;
import java.util.HashMap;
class LockPlain {
	private Map<String, String> dictionary = new HashMap<String, String>();
	
	@java.lang.SuppressWarnings("all")
	public void put(final String key, final String value) {
		if (key == null) {
			throw new java.lang.NullPointerException(java.lang.String.format("The validated object \'%s\' (argument #%s) is null", "key", 1));
		}
		if (key.isEmpty()) {
			throw new java.lang.IllegalArgumentException(java.lang.String.format("The validated object \'%s\' (argument #%s) is empty", "key", 1));
		}
		final String sanitizedKey = checkKey(key);
		this.dictionaryLock.writeLock().lock();
		try {
			dictionary.put(sanitizedKey, value);
		} finally {
			this.dictionaryLock.writeLock().unlock();
		}
	}
	
	@java.lang.SuppressWarnings("all")
	public String get(final String key) {
		if (key == null) {
			throw new java.lang.NullPointerException(java.lang.String.format("The validated object \'%s\' (argument #%s) is null", "key", 1));
		}
		if (key.isEmpty()) {
			throw new java.lang.IllegalArgumentException(java.lang.String.format("The validated object \'%s\' (argument #%s) is empty", "key", 1));
		}
		final String sanitizedKey = checkKey(key);
		this.dictionaryLock.readLock().lock();
		try {
			return dictionary.get(sanitizedKey);
		} finally {
			this.dictionaryLock.readLock().unlock();
		}
	}
	
	private String checkKey(final String key) {
		// do something;
		return key;
	}
	
	private final java.util.concurrent.locks.ReadWriteLock dictionaryLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
}