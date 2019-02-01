// complexity : (N log N)
// space complexity : (N)
public class HelloWorld
{
  
  public static void main(String[] args)
  {
    int[] sample = new int[]{9,8,6,4,4,5};
    
    // before
    for(int i = 0 ; i < sample.length ; i ++)
      System.out.print(" " + sample[i]);
    
    quickSort(sample, 0 , sample.length -1);
    
    // after sorting
    System.out.println();
    for(int i = 0 ; i < sample.length ; i ++)
      System.out.print(" " + sample[i]);
  }
  
  // quicksort
  public static void quickSort(int[] arr , int lo, int hi)
  {
    if(lo < hi)
    {
      int pivot = getPivot(arr, lo, hi);
      int p = partition(arr, lo, hi, pivot);
      quickSort(arr , lo , p-1);
      quickSort(arr, p+1 , hi);
    }
  }
  
  // partition
  public static int partition( int[] arr, int lo , int hi, int p )
  {
    int temp1 = arr[p];
    arr[p ]= arr[hi];
    arr[hi] = temp1;
    int i = lo - 1;
    for(int j = lo; j < hi ; j++)
    {
      if(arr[j] <= arr[hi])
      {
        i = i+1;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
      }
    }
    int temp2 = arr[i+1];
    arr[i+1] = arr[hi];
    arr[hi] = temp2;
    
    return i+1;
  }
  
  // get pivot method
  private static int getPivot(int[]arr , int lo, int hi)
  {
    return ((lo+hi)/2);
  }
  
}
