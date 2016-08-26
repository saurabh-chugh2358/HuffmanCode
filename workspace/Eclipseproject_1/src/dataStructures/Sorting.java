package dataStructures;

public class Sorting {

	public static void main(String[] args) {

		diffSortingAlgos sort = new diffSortingAlgos();
		int [] iArr = {1,2, 435, 32, 435, 657, 2, 345, 456, 3};
		sort.insertionSort(iArr, iArr.length);
		for (int i= 0; i<iArr.length; i++){
			System.out.println(iArr[i]);
		}
	}

}

class diffSortingAlgos {
	
	/* Insertion Sort for integers*/
	void insertionSort(int a[], int n){
		// Pre-condition: a contains n items to be sorted.
		int i, j, v;
		/*Initially, the first item is considered 'sorted'
		 *i divides into 
		 *x<i:  a sorted region
		 *x>=i: an unsorted region.*/
		 for (i=1; i<n; i++){
			 v= a[i];
			 j=i;
			 
			 while(a[j-1]>v){
				 a[j]=a[j-1];
				 j=j-1;
				 if (j<= 0){break;}
				 a[j] = v;
			 }
		 }
	}
}