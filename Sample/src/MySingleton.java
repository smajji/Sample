
public class MySingleton {
	
	
//	static class InstanceHolder {
		static MySingleton mySingleton = new MySingleton();
//	}

	private MySingleton(){		
	}
	
	public MySingleton getMySingleton(){
		return MySingleton.mySingleton;
	}
	
	boolean[] existsBoolean =new boolean[2];
	
	
}