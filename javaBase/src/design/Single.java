package design;

//public class Single {
//	private static volatile Single single;
//	
//	private Single() {}
//	
//	public static Single getInstance2() {
//		if(single==null){
//			single = new Single();
//		}
//		return single;
//	}
//	
//	/*
//	 * 同步的地方只是需要发生在单例的实例还未创建的时候，在实例创建以后，获取实例的方法就没必要再进行同步控制了
//	 * */
//	public synchronized static Single getInstance1() {
//		if(single==null){
//			single = new Single();
//		}
//		return single;
//	}
//
//	public static Single getInstance() {
//		if(single==null){
//			synchronized(Single.class){
//				//必须再判断一次，否则a，b线程同时判断了single==null，在加锁后不再次判断就会出现多个实例
//				if(single==null){
//					single = new Single();
//				}
//			}	
//		}
//		return single;
//	}
//}

public class Single {
	private static Single single=new Single();
	
	private Single() {}
	
	public static Single getInstance(){
		return single;
	}
}