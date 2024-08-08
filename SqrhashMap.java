package hash;
import java.util.HashMap;
import java.util.Map;

public class SqrhashMap {

	public static void main(String[] args) {
		 Map<Integer, Integer> map = new HashMap<>();

	        
	        for (int i = 1; i <= 15; i++) {
	            map.put(i, i * i);
	        }
	        System.out.println(map);

	}

}
