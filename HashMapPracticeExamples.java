package basicCoding;

import java.util.HashMap;

public class HashMapPracticeExamples {

	void calculatePopulation() {
        
		int Noida_pop = 0;
		int Gzb_pop = 0 ;
		int GrNoida_pop = 0 ;
		int Frdb_pop = 0;
		int Del_pop = 0;
		
		
		HashMap<String, Integer> hash_map = new HashMap<String,Integer>();	
		hash_map.put("Noida", 10000);
		hash_map.put("Gorakhpur", 50000);
		hash_map.put("Lucknow", 30000);
		hash_map.put("Ghaziabad", 40000);
		hash_map.put("Kanpur", 50000);
		hash_map.put("Delhi", 200000);
		hash_map.put("Faridabad", 100000);
		System.out.println("Hash Map size is = "+hash_map.size());
		
		if(hash_map.containsKey("Noida")) {
			Noida_pop = hash_map.get("Noida");
		}
		if(hash_map.containsKey("Ghaziabad")) {
			Gzb_pop = hash_map.get("Ghaziabad");
		}
		if(hash_map.containsKey("GrNoida")) {
			GrNoida_pop = hash_map.get("GrNoida");
		}
		if(hash_map.containsKey("Faridabad")) {
			Frdb_pop = hash_map.get("Faridabad");
		}
		if(hash_map.containsKey("Delhi")) {
			Del_pop = hash_map.get("Delhi");
		}
		int ncr_pop = Noida_pop + Gzb_pop + GrNoida_pop + Frdb_pop + Del_pop ;
		System.out.println("NCR Population is = "+ncr_pop);
		
	 }
	
	void removemapping() {
		HashMap<String, Integer> hash_new = new HashMap<String, Integer>();
		hash_new.put("A", 50);
		hash_new.put("B", 1000);
		hash_new.put("C", 50000);
		hash_new.clear();
		System.out.println("Size of the hash is = "+hash_new.size());
		System.out.println(hash_new.isEmpty());
		
		
		
	}


	public static void main(String[] args) {
		HashMapPracticeExamples obj = new HashMapPracticeExamples();
		//obj.calculatePopulation();
		obj.removemapping();

	}

}
