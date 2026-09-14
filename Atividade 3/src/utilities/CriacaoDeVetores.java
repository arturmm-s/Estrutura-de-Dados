package utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CriacaoDeVetores {
		
	Random random = new Random();
	
	public List<Integer> arrayCreate(int size) {
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<size; i++) {
			list.add(random.nextInt(1000));
		}
		return list;
	}
	
	public List<Integer> arrayCreate10() {
		return arrayCreate(10);
	}
	
	public List<Integer> arrayCreate20(){
		return arrayCreate(20);
	}
	
	public List<Integer> arrayCreate1000(){
		return arrayCreate(1000);
	}
}
