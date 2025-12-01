package program;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class B {

	public static void main(String[] args) {

		LinkedHashMap <String,Integer> hm=new LinkedHashMap<>();
		hm.put("program",1);
		hm.put("selenium",2);
		hm.put("java",3);
		hm.put("rest assured",4);
		/*
		System.out.println(hm);
		//only keys
		Set<String> keys=hm.keySet();
		for(String key:keys) {
			System.out.println(key);
		}
		
		Collection<Integer> values = hm.values();
		for(Integer value:values) {
			System.out.println(value);		
		}
		*/
	   Set<Map.Entry<String,Integer>> entries=hm.entrySet();
	   for(Map.Entry<String,Integer> entry:entries) {
		   System.out.println(entry.getKey()+"-"+entry.getValue());
	   }
	}

}
