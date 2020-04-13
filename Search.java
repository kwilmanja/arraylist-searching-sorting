import java.util.ArrayList;

public class Search{
	public static void main(String[] args){

		//Test search method:
		//ArrayList<String> nums = new ArrayList<String>();
		//nums.add("joe");
		//nums.add("caden");
		//nums.add("max");
		//nums.add("pierce");
		//System.out.println(search(nums, "joe"));
		//System.out.println(search(nums, "pierce"));
		//System.out.println(search(nums, "kibby"));

		ArrayList<String> haystack = new ArrayList<String>();

		String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

		for(String letter : letters){
			haystack.add(letter);
		}
		System.out.println(binarySearch(haystack, "d"));
	}

	public static int binarySearch(ArrayList<String> haystack, String needle){
		int[] bounds = new int[]{0, haystack.size()};

		while(bounds[1] - bounds[0] > 1){

		//get middle element
			int location = (bounds[0] + bounds[1]) / 2;
			//System.out.println(location);
		//check element --- if true - return location
			if(haystack.get(location).equals(needle)) return location;
		//compare to needle
			int comparison = haystack.get(location).compareTo(needle);
			if(comparison < 0){ //bound second half
				bounds[0] = location;
			}
			else{//bounds first half
				bounds[1] = location;
			}
		}

		return -1;
	}

	public static int search(ArrayList<String> haystack, String needle){
		int location = -1;
		for(int i = 0; i<haystack.size(); i++){
			if(haystack.get(i).equals(needle)){
				location = i;
			}
		}
		return location;
	}
}