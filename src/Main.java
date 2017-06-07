import java.math.BigDecimal;


public class Main {
	public static int NUMBER_OF_SETS_PER_TEST =5;
	
	
	public static void fillArray(int[] arr){
		for(int x = 0 ;x<arr.length ; x++){
			arr[x] = StdRandom.uniform(100000,999999);
		}
		
	}
	
	public static void printArray(int[] arr){
		System.out.println();
		for(int t : arr){
			System.out.print(" "+ t);
		}
		System.out.println();
	}
	
	public static int[] generateRandomIntArray(int length){
		int[] retValue = new int[length];
		fillArray(retValue);
		return retValue;
	}
	public static void printAggregatedSetsOfTest(SetOfTest[] aggregatedSetsOfTests){
		for(SetOfTest t: aggregatedSetsOfTests){
			t.printSet();
		}
		
	}

	
	
	public static void main(String[] args) {
			SetOfTest[] tests = new SetOfTest[NUMBER_OF_SETS_PER_TEST];
			//populates three set
			int power = 3;
			for(int x = 0;x<NUMBER_OF_SETS_PER_TEST ;x++){
				int[] oneOfTwo=	generateRandomIntArray((int)Math.pow(10,power));
				int[] twoOfTwo = generateRandomIntArray((int)Math.pow(10,power));
				tests[x] =  new SetOfTest(oneOfTwo,twoOfTwo);
				power++;
						
					
			}
			
			// print set test
	//		printAggregatedSetsOfTest(tests);
			for(SetOfTest t : tests){
				System.out.println(t.findIndenticalInts());
				BigDecimal rate = new BigDecimal(((double)t.findTotalIdentical()/(double)t.getFirstSet().length)*100);
			
				///(double)t.getFirstSet().length;
				
			
				System.out.println("Identical ratio : "+rate.doubleValue());
			}
		
			
	}	

}
