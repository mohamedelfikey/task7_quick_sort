/*
 * function to do quick sort
 * mohamed ahmed elsayed elfikey
 *id 1900306
 */
package task7_quick_sort;


public class Task7_quick_sort {

   
    public static void main(String[] args) {
        int [] array={5,4,6,18,2,1,68,3};
        quick_sort(array,0,7);
        
        
        
                
        
    }
    // function to do swapping
//    public static void swap (int x,int y)
//    {
//        int temp=x;
//        x=y;
//        y=temp;
//    }
    //function to do partitionning
    public static int partition (int []arr ,int ibegin,int jend)
    {
        int i=ibegin;
        int j=jend;
        int pivot_location=i; //pivot location always starts from the beginning.
        while (true){
            // start of doing algorithm
            while (arr[pivot_location]<=arr[j] && pivot_location!=j)
            {
                j--;
            }
            // conditoins after second while to do action dependant on why we exit from second while
            if (pivot_location==j)// when we reach the end elemant in array
            {
                break; // exit from the first while
            }
            else if (arr[pivot_location]>arr[j]) // to swap if we find the element in the right is less than the pivot
            {
                int temp=arr[i];
                arr[i]=arr[pivot_location];
                arr[pivot_location]=temp;
                pivot_location=j; // to back the pivot in the coorect location notin the end of array
            }
            // to check the left side
            while (arr[pivot_location]>=arr[i] && pivot_location!=i)
            {
                i++;
            }
             if (pivot_location==i)
            {
                break; // exit from the first while
            }
             else if (arr[pivot_location]>arr[j]) // to swap if we find the element in the left is more than the pivot
            {
                int temp=arr[i];
                arr[i]=arr[pivot_location];
                arr[pivot_location]=temp;
                pivot_location=i; // to back the pivot in the coorect location notin the end of array
            }
             
        }
        
        return pivot_location;
    }
    //function to do quick sort
    public static void quick_sort(int []arr ,int a,int b)
    {
        if (a<b)
        {
            int loc=partition (arr ,a,b);//store pivot location in loc
            quick_sort(arr,a,loc-1); //to do in the right
            quick_sort(arr,loc+1,b); //to do in the left           
        }
    }
  
    
}
