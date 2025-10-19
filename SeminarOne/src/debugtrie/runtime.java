package debugtrie;

public class runtime {
	
	// -------Runtime Errors (Exceptions)-------
	// Occur while the program is running.
	// 	Compiles successfully but crashes during execution.
	
	// Step-by-step Debugging
	// Use IDE breakpoints to pause and inspect variables.
	// Step through loops and conditionals to find errors.
	
	
	public static int[] bubbleSort(int[] arr) {
		
		int n = arr.length;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		
		int[] ex = {5,3,8,4,2}; 
		
		System.out.print("Initial array: ");
		for (int a = 0; a < ex.length; a++)
			System.out.print(ex[a] + " ");
		
		bubbleSort(ex);
		
		System.out.println();
		System.out.print("Sorted array: ");
        for (int a : ex) //Enhanced for loop aka for-each loop
            System.out.print(a + " ");
		
	}
}
