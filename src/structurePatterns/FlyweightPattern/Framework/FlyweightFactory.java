package structurePatterns.FlyweightPattern.Framework;

import java.util.HashMap;

class FlyweightFactory {
	private static HashMap<String, Flyweight> pool=new HashMap<String, Flyweight>();
	
	public static Flyweight getFlyweight(String Extrinsic){
		Flyweight flyweight=null;
		if(pool.containsKey(Extrinsic)){
			return pool.get(Extrinsic);
		}else{
			flyweight=new ConcreteFlyweight1(Extrinsic);
			pool.put(Extrinsic, flyweight);
		}
		return flyweight;
	}
}
