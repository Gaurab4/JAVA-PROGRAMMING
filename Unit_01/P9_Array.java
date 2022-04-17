package Unit_01;

import java.util.Arrays;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
		Arrays.sort(arr);

	}

	void findTheDuplicateElements(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.println("true");
			}
		}

	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
				Arrays.sort(arr);
				int size = arr.length;
				System.out.println(arr[size -2]);
				System.out.println(arr[1]);
				
	}

	void leftRotationInAnArray(int[] arr) {
		Arrays.sort(arr);
		int size = arr.length;
		int remp = arr[size -1];
		
		

	}

	void removeElementInArray(int[] arr) {
		//	arr.
			
	}

}
