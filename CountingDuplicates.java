import java.util.*;

public class CountingDuplicates{
	public void insereLista(String inp){
		char[] spt = inp.toCharArray();

		Map<Character, Integer> letrasMap = new HashMap<>();

		int repeated = 0;
		for(Character c : spt){
			if(letrasMap.containsKey(c)) {
				letrasMap.put(c, letrasMap.get(c) + 1);
			}else{
				letrasMap.put(c, 1);
			}
		}

		Set<Character> keys = letrasMap.keySet();

		int cont = 0;
		for(Character c : keys){
			if(letrasMap.get(c) > 1){
				cont++;
			}
		}
		System.out.println(cont);
	}


	public static void main (String[]args){
		CountingDuplicates cd = new CountingDuplicates();
		Scanner in = new Scanner(System.in);
		String inp = in.nextLine().toLowerCase();
		cd.insereLista(inp);
		
	}
}
