package RealTest;

class Generic<T> {
	private T data;
	
	public void setData(T data) {
		this.data = data;
	}
	public T getData() {
		return data;
	}
}

class MyHash<K, V> {
	private K key;
	private V value;
	
	public void setHash(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}

class GenericMethod {
	public <T> T Return(T data) {
		return data;
	}
}

class Utility {
	public static String typeof(Object type) {
		String[] types = new String[5];
		types = type.getClass().getName().split(".");
		System.out.println(types.getClass().getName());
		
		return null;
	}
}

public class GenericTest {
	public static void main(String[] args) {
		Generic<Integer> g = new Generic<Integer>();
		g.setData(10);
		int data = g.getData().intValue();
		System.out.println(data);
		
		
		
		MyHash<String, Object> hash = new MyHash<>();
		hash.setHash("Lee", "JinHyeok");
		String key = hash.getKey();
		Object value = hash.getValue();
		
		System.out.println("key : " + key);
		System.out.println("value : " + value);
		
		
		
		GenericMethod gm = new GenericMethod();
		System.out.println(gm.Return(10).getClass());
		System.out.println(gm.Return("Lee").getClass());
		System.out.println(gm.Return("Lee").getClass().getName());
		
		Utility.typeof(gm.Return(data));
	}
}