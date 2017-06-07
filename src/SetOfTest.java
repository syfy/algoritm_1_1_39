import java.util.ArrayList;
import java.util.List;

public class SetOfTest {
	int[] firstSet;
	int[] secondSet;
	private int numberOfIdenticals;
	public static void printArray(int[] arr) {
		System.out.println();
		for (int t : arr) {
			System.out.print(" " + t);
		}
		System.out.println();
	}

	public void printFirstSet() {
		printArray(this.firstSet);
		System.out.println("Length :" + firstSet.length);
	}

	public void printSecondSet() {
		System.out.println("Length :" + secondSet.length);
		printArray(this.secondSet);

	}

	public void printSet() {
		printFirstSet();
		printSecondSet();

	}

	SetOfTest(int[] firstSetArg, int[] secondTestArg) {
		this.firstSet = firstSetArg;
		this.secondSet = secondTestArg;
	}

	public int[] getFirstSet() {
		return firstSet;
	}

	public static int binarySearch(int e, int[] arr) {
		int loIndex = 0;
		int hiIndex = arr.length - 1;
		while (loIndex <= hiIndex) {
			int midIndex = loIndex + ((hiIndex - loIndex) / 2);

			if (e == arr[midIndex]) {
				return arr[midIndex];
			}
			if (e > arr[midIndex]) {
				loIndex = midIndex + 1;
			}
			if (e < arr[midIndex]) {
				hiIndex = midIndex - 1;
			}
		}
		return -1;
	}

	public void setFirstSet(int[] firstSet) {
		this.firstSet = firstSet;
	}

	public int[] getSecondSet() {
		return secondSet;
	}

	public void setSecondSet(int[] secondSet) {
		this.secondSet = secondSet;
	}
	
	public int findTotalIdentical(){
		return this.numberOfIdenticals;
	}

	public List findIndenticalInts() {
		ArrayList<Integer> identicalIntegers = new ArrayList<Integer>();
			for(int t: firstSet){
				int searchIndex = binarySearch(t, secondSet) ;
				if(searchIndex >-1){
					identicalIntegers.add(searchIndex);
				}
			}
		numberOfIdenticals = identicalIntegers.size();
		return identicalIntegers;
	}

}
