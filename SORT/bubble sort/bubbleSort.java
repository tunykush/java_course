package bubble sort;

//public class remeber {
    
//}

private static void bubbleSort( int[] a, int n) {
    for(int i=0; i<n-1; i++) {          //Loop once for each element in the array.
        for(int j=0; j<n-1-i; j++) {     //Once for each element, minus the counter.
            if(a[j]>a[j+1]) {          //Test if need a swap or not.
                int tmp=a[j];          //These three lines just swap the two elements:
                a[j]=a[j+1];
                a[j+1]=tmp;
            }
        }
    }
}

Arrays.sort(a);                     //shortcut