package design;

public class Single {
	private static Single single;
	
	private Single() {
		
	}

	public static Single getSingleObj() {
		if(single==null){
			single = new Single();
		}
		return single;
	}
}
