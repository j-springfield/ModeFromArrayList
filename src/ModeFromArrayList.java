import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ModeFromArrayList {
	private static Integer getModeFromList(ArrayList<Integer> inputList) {
		Integer mode = 0;
		Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		for(Integer inputNumber : inputList){
			if(!numberMap.containsKey(inputNumber)){
				numberMap.put(inputNumber, 1);
			} else{
				Integer value = numberMap.get(inputNumber) + 1;
				numberMap.put(inputNumber, value);
			}
		}
		
		return mode;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		tempList.add(8);
		tempList.add(3);
		tempList.add(7);
		tempList.add(8);
		tempList.add(5);
		tempList.add(7);
		tempList.add(8);
		tempList.add(4);
		tempList.add(3);
		System.out.println("The mode from this list is: " + getModeFromList(tempList));
	}

	

}
