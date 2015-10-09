import java.util.LinkedHashMap;
import java.util.Map;


public class LRUCache extends LinkedHashMap {
	
	public int maxEntries;
	
	public LRUCache(int maxEntries){
		super(maxEntries+1, 1.0f);
		this.maxEntries=maxEntries;		
	}
	
	@Override
	protected boolean removeEldestEntry(final Map.Entry eldest){
		return super.size() > maxEntries;
	}
	
	public static void main(String s[]){
		LRUCache l = new LRUCache(2);
		l.put("1", "1");
		l.put("2", "2");
		l.put("3", "3");
		for(Object o :l.entrySet()){
			Map.Entry e = (Map.Entry) (o);
			System.out.println(e.getKey());
		}
	}

}
