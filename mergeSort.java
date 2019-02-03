public class HelloWorld
{
  
  public static void main(String[] args)
  {
    int[] arr = new int[]{4};
    for(int i = 0 ; i < arr.length ; i++)
      System.out.print(" "+arr[i]);
    System.out.println();
    mergeSort(arr , 0 , arr.length -1);
    for(int i = 0 ; i < arr.length ; i++)
      System.out.print(" "+ arr[i]);
  }
  
  // Mergesort
  public static void mergeSort(int[] arr , int lo , int hi)
  {
    if( lo == hi )
      return ;
    
    int m  = (int)Math.floor((lo + hi ) /2);
    mergeSort(arr , lo , m);
    mergeSort(arr , m + 1 , hi);
    merge(arr, lo , m , m+1 , hi);
    
  }
  
  // Merge
  public static void merge( int[] arr , int lo1 , int hi1 , int lo2, int hi2)
  {
    int n = (hi1 - lo1) + ( hi2 - lo2) +2;
    int[] temp = new int[n];
    int a = lo1 , b = lo2 , c = 0;
    while(a <= hi1 && b <= hi2)
    {
      if(arr[a] <= arr[b])
      {
        temp[c] = arr[a];
        c++;
        a++;
      }
      else
      {
        temp[c] = arr[b];
        b++;
        c++;
      }
    }
    
    while(a<=hi1)
    {
      temp[c] = arr[a];
      a++;
      c++;
    }
    while(b <= hi2)
    {
      temp[c] = arr[b];
      b++;
      c++;
    }
    
    for(int i = lo1; i <= hi1 ;i++)
    {
      arr[i] = temp[i - lo1];
    }
    for(int i = lo2 ; i<= hi2 ; i++)
    {
      arr[i] = temp[hi1 - lo1 + 1 + (i - lo2)];
    }
  }
  
}
