import java.util.ArrayList;

public class Sort{
	public static void main(String[] args){

	
		ArrayList<String> haystack = new ArrayList<String>();
		String[] words = {"loves", "hates", "sees", "knows", "looks for", "finds"};
		for(String word : words){
			haystack.add(word);
		}

		//selectionSort(haystack);
		//insertionSort(haystack);
		bubbleSort(haystack);
		for(String word : haystack){
			System.out.println(word);
		}



	}

	public static void bubbleSort(ArrayList<String> list){
		int swaps = 1;
		while(swaps != 0){
			swaps = 0;

			System.out.println();
			for(String word : list){
			System.out.println(word);
			}

			for(int i = 0; i<list.size() - 1; i++){
				if(list.get(i).compareTo(list.get(i+1)) > 0){
					swaps++;
					String saver = list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1, saver);
				}
			}
		}
	}

	public static void insertionSort(ArrayList<String> list){
		//counter
		for(int i = 1; i<list.size(); i++){
			//while no good (previous one is higher)
			while(list.get(i-1).compareTo(list.get(i)) > 0){
			//switch values
				String saver = list.get(i);
				list.set(i, list.get(i-1));
				list.set(i-1, saver);
				if(i>1) i--;
			}
		}
	}

	public static void selectionSort(ArrayList<String> list){
		for(int x = 0; x < list.size(); x ++){
				int location = x;
				for (int i = x; i<list.size(); i++){
				//check spot to current location's value -- if less - location = i;
					if(list.get(i).compareTo(list.get(location)) < 0){
						location = i;
					}	
				}
				//switch values
				String saver = list.get(x);
				list.set(x, list.get(location));
				list.set(location, saver);
		}

	}
}